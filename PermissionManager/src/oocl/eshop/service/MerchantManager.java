package oocl.eshop.service;

import oocl.eshop.po.Merchant;

public interface MerchantManager {

	public Merchant loginSystem(String username, String password);
	
	public boolean updateMerchant(Merchant merchant);
	
}
