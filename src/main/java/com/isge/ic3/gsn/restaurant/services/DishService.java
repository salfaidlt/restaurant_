package com.isge.ic3.gsn.restaurant.services;

import java.util.List;
import java.util.Optional;

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

    public void delete(Long id) {
        dishRepository.deleteById(id);
    }

    public Optional<Dish> update(Long id, Dish dish_) {
        return dishRepository.findById(id).map(dish -> {
            dish.setName(dish_.getName());
            dish.setPrice(dish_.getPrice());
            dish.setAllergens(dish_.getAllergens());
            dish.setCategory(dish_.getCategory());
            dish.setDescription(dish_.getDescription());
            dish.setStatus(dish_.getStatus());
            dish.setMenus(dish_.getMenus());

            return dishRepository.save(dish);
        });
    }
}
