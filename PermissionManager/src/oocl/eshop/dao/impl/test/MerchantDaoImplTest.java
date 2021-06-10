package oocl.eshop.dao.impl.test;

import java.util.ArrayList;
import java.util.List;

import oocl.eshop.dao.MerchantDao;
import oocl.eshop.po.Merchant;

public class MerchantDaoImplTest implements MerchantDao{

	@Override
	public List<Merchant> findAllMerchants() {
		List<Merchant> mers=new ArrayList<Merchant>();
		for(int i=1;i<10;i++){
			Merchant merchant = new Merchant("Kinva"+i, i*100+"", "123456", "12345", "http://www.005.tv/uploads/allimg/160617/1P3391451-3.jpg", "haha", "heihei", "http://www.005.tv/uploads/allimg/160617/1P3391451-3.jpg");
			merchant.setmId(i);
			merchant.setmStatus( (int)(Math.random()*4)+1);
			mers.add(merchant);
		}
		return mers;
	}

	@Override
	public int addMerchant(Merchant m) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int deleteMerchant(int mId) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int updateMerchant(Merchant m) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public Merchant findMerchantByTel(String mTel) {
		// TODO Auto-generated method stub
		Merchant merchant = new Merchant("Knife", mTel, "123456", "12345", "testPath", "haha", "heihei", "testPath");
		merchant.setmId(2);
		return merchant;
				
	}

	@Override
	public Merchant findMerchantById(String mId) {
		Merchant merchant = new Merchant("Knife", "6666", "123456", "12345", "testPath", "haha", "heihei","testPath");
		merchant.setmId(2);
		return merchant;
	}

}
