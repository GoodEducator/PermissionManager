package oocl.eshop.dao.impl.test;

import java.util.ArrayList;
import java.util.List;

import oocl.eshop.dao.FoodDao;
import oocl.eshop.po.Food;

public class FoodDaoImplTest implements FoodDao {

	@Override
	public int AddFood(Food f) {
		return 1;
	}

	@Override
	public int deleteFood(int fId) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public List<Food> findAllFood(int mId) {
		// TODO Auto-generated method stub
		List<Food> foods = new ArrayList<Food>();
		for (int i = 0; i < 10; i++) {
			Food food = new Food("Food" + i, 1, 20, "testPath");
			food.setfId(i);
			foods.add(food);
		}
		for (int i = 10; i < 20; i++) {
			Food food = new Food("Food" + i, 2, 20, "testPath");
			food.setfId(i);
			foods.add(food);
		}

		return foods;
	}

	@Override
	public int updateFood(Food f) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public List<Food> findFoodByName(String fName) {
		List<Food> foods = new ArrayList<Food>();
		for (int i = 0; i < 10; i+=2) {
			Food food = new Food(fName, i, 20, "testPath");
			food.setfId(i);
			foods.add(food);
		}
		return foods;
	}

	@Override
	public Food findFoodById(int fId) {
		// TODO Auto-generated method stub
		return new Food("TestFood", fId, 30, "testPath");
	}

}
