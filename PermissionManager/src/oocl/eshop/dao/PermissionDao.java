package oocl.eshop.dao;

import oocl.eshop.po.Permission;

public interface PermissionDao {
	public Permission findPermisson(int mId);// 根据Id查找状态；

	public int updatePermisson(Permission p);// 根据Id修改状态；
	
	public int addPermisson(Permission p);

}
