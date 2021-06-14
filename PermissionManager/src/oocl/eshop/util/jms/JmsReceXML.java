package oocl.eshop.util.jms;

import java.io.IOException;
import java.io.StringReader;
import java.util.function.Consumer;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.jdom.Document;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.springframework.aop.ThrowsAdvice;
import org.xml.sax.InputSource;

import oocl.eshop.po.Merchant;

public class JmsReceXML {
	public static Document doc;
	public static Merchant merchant = null;
	public static String sMerchant = null;

	public static void jmsReceXML() {
		ConnectionFactory factory = new ActiveMQConnectionFactory("failover://tcp://localhost:61616");
		Destination queue = new ActiveMQQueue("storeXML");
		Connection con;
		Session sen;
		MessageConsumer consumer;
		// TextMessage message;
		try {
			con = factory.createConnection();
			con.start();
			sen = con.createSession(false, Session.AUTO_ACKNOWLEDGE);
			consumer = sen.createConsumer(queue);
			
			// 匿名内部类不断接收xml文件			
			consumer.setMessageListener(new DoMessageListener());
//			consumer.setMessageListener(new MessageListener() {
////				AnalyzeXML analyzeXML = new AnalyzeXML();
////				Merchant merchant2;
//
//				public void onMessage(Message arg0) {
//					// TODO Auto-generated method stub
//					TextMessage msg = (TextMessage) arg0;
//					try {
//						JmsReceXML.sMerchant = msg.getText();
//					} catch (JMSException e) {
//						e.printStackTrace();
//					}
//				}
//			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

