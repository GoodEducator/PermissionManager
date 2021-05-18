package oocl.eshop.dao;

import java.util.List;
import oocl.eshop.po.Merchant;

public interface MerchantDao {
	public List<Merchant> findAllMerchants();// C端查询所有的商家；

	public int addMerchant(Merchant m);// 添加商户；

	public int deleteMerchant(int mId);// 删除商户；

	public int updateMerchant(Merchant m);// 更新商户信息；

	public Merchant findMerchantByTel(String mTel);// 根据用户名查询商户信息；

	public Merchant findMerchantById(String mId);// 根据商户id查询商户信息；

}
