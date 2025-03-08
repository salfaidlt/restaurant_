package com.isge.ic3.gsn.restaurant.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isge.ic3.gsn.restaurant.models.Dish;
import com.isge.ic3.gsn.restaurant.services.DishService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api/dishes")
public class DishController {

    @Autowired
    DishService dishService;

    @GetMapping
    public List<Dish> getAllDishes() {
        return dishService.getAllDishes();
    }
    
    @PostMapping
    public Dish createDish(@RequestBody Dish dish) {
        return dishService.create(dish);
    }
    
    @DeleteMapping("/{id}")
    public void deleteDishById(@PathVariable Long id) {
        dishService.delete(id);
    }

    @PutMapping("/{id}")
    public Optional<Dish> updateDishById(@PathVariable Long id, @RequestBody Dish dish) {
        return dishService.update(id, dish);
    }
}
