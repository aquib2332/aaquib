package com.food.food_Spring_App.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.food_Spring_App.dto.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer>
{

}
