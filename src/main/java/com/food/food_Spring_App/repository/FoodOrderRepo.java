package com.food.food_Spring_App.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.food_Spring_App.dto.FoodOrder;

public interface FoodOrderRepo extends JpaRepository<FoodOrder, Integer>
{

}
