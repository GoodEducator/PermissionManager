package oocl.eshop.daoimpl.test;

import oocl.eshop.dao.PermissionDao;
import oocl.eshop.po.Permission;

public class PermissionDaoImplTest implements PermissionDao{

	@Override
	public Permission findPermisson(int mId) {
		// TODO Auto-generated method stub 
		return new Permission(mId, (int)(Math.random()*4)+1);
	}

	@Override
	public int updatePermisson(Permission p) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int addPermisson(Permission p) {
		// TODO Auto-generated method stub
		return 1;
	}

}
