package oocl.eshop.util.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import oocl.eshop.dao.MerchantDao;
import oocl.eshop.dao.PermissionDao;
import oocl.eshop.dao.impl.test.MerchantDaoImplTest;
import oocl.eshop.dao.impl.test.PermissionDaoImplTest;
import oocl.eshop.po.Merchant;
import oocl.eshop.po.Permission;


public class DoMessageListener implements MessageListener{
	
	public  void onMessage(Message arg0) {
		// TODO Auto-generated method stub
		TextMessage msg = (TextMessage) arg0;
		try {
			String sMerchant = msg.getText();
			System.out.println(sMerchant);
			//将商家的string数据改为对象
			AnalyzeXML analyzeXML = new AnalyzeXML();
			Merchant merchant = analyzeXML.analyzeXML(sMerchant);
//			String mPersonName = merchant.getmPersonName();
//			String mTel = merchant.getmTel();
//			String mPassword = merchant.getmPassword();
//			String mIdCard = merchant.getmIdCard();
//			String mCardPath = merchant.getmCardPath();
//			String mLocation = merchant.getmLocation();
//			String mBrand = merchant.getmBrand();
//			String mLogoPath = merchant.getmLogoPath();
//			int mStatus = 1;
			//调用数据库的方法添加数据
			MerchantDao merchantDaoImpl = new MerchantDaoImplTest();
			merchantDaoImpl.addMerchant(merchant);
			merchant = merchantDaoImpl.findMerchantByTel(merchant.getmTel());
			
			PermissionDao permissionDaoImpl = new PermissionDaoImplTest();
			Permission permission = new Permission(merchant.getmId(), 1);
			permissionDaoImpl.addPermisson(permission);
			

		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
