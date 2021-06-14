package oocl.eshop.util.jms;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import oocl.eshop.po.Merchant;

public class OutputXML {
	public String OutputXML(Merchant merchant){
		String sMerchant = null;
		Document doc = new Document();
		Element root = new Element("Merchant");
		doc.setRootElement(root);
		
		Element mPersonName = new Element("mPersonName");
		Element mTel = new Element("mTel");
		Element mPassword = new Element("mPassword");
		Element mIdCard = new Element("mIdCard");
		Element mCardPath = new Element("mCardPath");
		Element mLocation = new Element("mLocation");
		Element mbrand = new Element("mBrand");
		Element mLogoPath = new Element("mLogoPath");
//		mPersonName.setAttribute("mPersonName",merchant.getmPersonName());
//		mTel.setAttribute("mTel",merchant.getmTel());
//		mPassword.setAttribute("mPassword", merchant.getmPassword());
//		mIdCard.setAttribute("mIdCard", merchant.getmIdCard());
//		mCardPath.setAttribute("mCardPath", merchant.getmCardPath());
//		mLocation.setAttribute("mLocation", merchant.getmLocation());
//		mbrand.setAttribute("mBrand", merchant.getmBrand());
//		mLogoPath.setAttribute("mLogoPath", merchant.getmLogoPath());
		
		mPersonName.setText(merchant.getmPersonName());
		mTel.setText(merchant.getmTel());
		mPassword.setText(merchant.getmPassword());
		mIdCard.setText( merchant.getmIdCard());
		mCardPath.setText(merchant.getmCardPath());
		mLocation.setText(merchant.getmLocation());
		mbrand.setText(merchant.getmBrand());
		mLogoPath.setText(merchant.getmLogoPath());
				
		root.addContent(mPersonName);
		root.addContent(mTel);
		root.addContent(mPassword);
		root.addContent(mIdCard);
		root.addContent(mCardPath);
		root.addContent(mLocation);
		root.addContent(mbrand);
		root.addContent(mLogoPath);
		
		XMLOutputter out = new XMLOutputter(Format.getPrettyFormat());
		try {
			ByteArrayOutputStream out2 = new ByteArrayOutputStream();
			out.output(doc, out2);
			sMerchant = new String(out2.toByteArray());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sMerchant;
	}
}
