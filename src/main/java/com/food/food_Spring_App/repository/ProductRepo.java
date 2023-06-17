package com.food.food_Spring_App.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.food_Spring_App.dto.Product;

public interface ProductRepo extends JpaRepository<Product,Integer>
{

}
