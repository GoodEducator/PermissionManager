package oocl.eshop.util.jms;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.stream.XMLInputFactory;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import oocl.eshop.po.Merchant;

public class AnalyzeXML {
	public Merchant analyzeXML(String sMerchant){
	ByteArrayInputStream in = new ByteArrayInputStream(sMerchant.getBytes());
	SAXBuilder builder = new SAXBuilder();
	Document doc = null;
	try {
		doc = builder.build(in);
	} catch (JDOMException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Element Merchant = doc.getRootElement();
	String mPersonName = Merchant.getChildText("mPersonName");
	String mTel = Merchant.getChildText("mTel");
	String mPassword = Merchant.getChildText("mPassword");
	String mIdCard = Merchant.getChildText("mIdCard");
	String mCardPath = Merchant.getChildText("mCardPath");
	String mLocation = Merchant.getChildText("mLocation");
	String mBrand = Merchant.getChildText("mBrand");
	String mLogoPath = Merchant.getChildText("mLogoPath");
	Merchant merchant = new Merchant(mPersonName, mTel, mPassword, mIdCard, mCardPath, mLocation, mBrand, mLogoPath);
	return merchant;
	
	}
}
