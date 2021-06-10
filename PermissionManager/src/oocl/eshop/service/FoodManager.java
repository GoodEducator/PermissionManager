package oocl.eshop.service;

import java.util.List;

import oocl.eshop.po.Food;

public interface FoodManager {

	public List<Food> findFoodByName(String foodname);

	public int updateFood(Food food);

}
