package oocl.eshop.service.impl;

import oocl.eshop.dao.PermissionDao;
import oocl.eshop.dao.impl.test.PermissionDaoImplTest;
import oocl.eshop.po.Permission;
import oocl.eshop.service.PermissionManager;

public class PermissionManagerImpl implements PermissionManager{
	PermissionDao pers = new PermissionDaoImplTest();
	

	@Override
	public int updatePermission(Permission permission) {
		// TODO Auto-generated method stub
		return pers.updatePermisson(permission);
	}
	
	

}
