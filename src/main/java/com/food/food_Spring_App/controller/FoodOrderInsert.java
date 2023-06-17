package com.food.food_Spring_App.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.food_Spring_App.dao.FoodOrderDao;
import com.food.food_Spring_App.dto.FoodOrder;

@RestController
@RequestMapping("/foodOrders")
public class FoodOrderInsert 
{
	@Autowired
	FoodOrderDao foodOrderDao;
	
	@PostMapping
	public FoodOrder placeFoodOrder(@RequestBody FoodOrder foodOrder)
	{
		return foodOrderDao.saveFoodOrder(foodOrder);
	}
	

}
