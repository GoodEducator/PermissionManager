package oocl.eshop.dao;

import java.util.List;

import oocl.eshop.po.Food;

public interface FoodDao {
	public int AddFood(Food f);// 增加菜品；

	public int deleteFood(int fId);// 删除菜品；

	public List<Food> findAllFood(int mId);// 根据商家Id查询商家对应的菜品；

	public int updateFood(Food f);// 更新菜品信息；包括ID 名字 价格以及图片路径；

	public List<Food> findFoodByName(String fName);// 根据菜品名查找相应的菜品；

	public Food findFoodById(int fId);// 根据菜品Id查找菜品；
}
