package oocl.eshop.service.impl;

import java.util.List;

import oocl.eshop.dao.MerchantDao;
import oocl.eshop.dao.PermissionDao;
import oocl.eshop.dao.impl.test.MerchantDaoImplTest;
import oocl.eshop.dao.impl.test.PermissionDaoImplTest;
import oocl.eshop.po.Merchant;
import oocl.eshop.service.MerchantManager;

public class MerchantManagerImpl implements MerchantManager {
	MerchantDao merchants = new MerchantDaoImplTest();
	PermissionDao pers = new PermissionDaoImplTest();

	@Override
	public List<Merchant> findAllMerchant() {
		List<Merchant> mers = merchants.findAllMerchants();
		for (Merchant merchant : mers) {
			merchant.setmStatus(pers.findPermisson(merchant.getmId()).getmStatus());
		}
		return mers;
	}

}
