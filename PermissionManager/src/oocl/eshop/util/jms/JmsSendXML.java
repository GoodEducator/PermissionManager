package oocl.eshop.util.jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.jdom.Document;

import oocl.eshop.po.Merchant;

public class JmsSendXML {
	public static boolean jmsXML(Merchant merchant){
		//创建connectionFactory
		ConnectionFactory factory = new ActiveMQConnectionFactory("failover://tcp://localhost:61616");
		//创建队列转存
		Destination queue = new ActiveMQQueue("storeXML");
		
		try {
			Connection con = factory.createConnection();
			con.start();
			Session sen = con.createSession(false, Session.AUTO_ACKNOWLEDGE);
			MessageProducer  producer = sen.createProducer(queue);
			OutputXML outputXML = new OutputXML();
			String sMerchant = outputXML.OutputXML(merchant);
			TextMessage msg = sen.createTextMessage(sMerchant);
			producer.send(msg);
			producer.close();
			sen.close();
			con.close();
			return true;
		} catch (JMSException e) {
			System.out.println("send fail.");
			return false;
		}
		
	}
}
