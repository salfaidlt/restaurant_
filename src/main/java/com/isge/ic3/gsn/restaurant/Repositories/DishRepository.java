package com.isge.ic3.gsn.restaurant.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isge.ic3.gsn.restaurant.models.Dish;

public interface DishRepository extends JpaRepository<Dish, Long> {

}
