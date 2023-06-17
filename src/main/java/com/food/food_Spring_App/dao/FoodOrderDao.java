package com.food.food_Spring_App.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.food.food_Spring_App.dto.FoodOrder;
import com.food.food_Spring_App.dto.Item;
import com.food.food_Spring_App.repository.FoodOrderRepo;
import com.food.food_Spring_App.repository.ItemRepo;

//@Repository--> It is used indicate that the class provides the mechanism to perform all CRUD Operation.


@Repository
public class FoodOrderDao

{
	@Autowired
	FoodOrderRepo repo;
	
	@Autowired
	ItemRepo itemRepo;
	
	public FoodOrder saveFoodOrder(FoodOrder order)
	{
		List<Item> listofItems=order.getItems();
		List<Item> res =new ArrayList<>();
		if(listofItems.isEmpty())
		{
			order=repo.save(order);
		}
		else
		{
			order=repo.save(order);
			for(Item item: listofItems)
			{
				item.setFoodorder(order);
				res.add(itemRepo.save(item));
			}
			order.setItems(res);	
			
		}
		
		return order;
	}
   
	public Optional<FoodOrder> getFoodOrderById(int id)
	{
		return repo.findById(id);
	}
	
	public List<FoodOrder> getAllFoodOrder() 
	{
		return repo.findAll();
	}
	
	public FoodOrder updateFoodOrder(FoodOrder foodOrder) 
	{
		return repo.save(foodOrder);
	}
	
	public void deleteFoodOrder(int id)
	{
		repo.deleteById(id);
	}




	
	
	
	
	
}
