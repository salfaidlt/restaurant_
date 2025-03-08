package com.isge.ic3.gsn.restaurant.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isge.ic3.gsn.restaurant.Repositories.DishRepository;
import com.isge.ic3.gsn.restaurant.models.Dish;

@Service
public class DishService {

    @Autowired
    DishRepository dishRepository;

    public List<Dish> getAllDishes() {
        return dishRepository.findAll();
    }

    public Dish create(Dish dish) {
        return dishRepository.save(dish);
    }
}
