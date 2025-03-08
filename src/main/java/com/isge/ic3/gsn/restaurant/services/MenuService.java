package com.isge.ic3.gsn.restaurant.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isge.ic3.gsn.restaurant.Repositories.MenuRepository;
import com.isge.ic3.gsn.restaurant.models.Dish;
import com.isge.ic3.gsn.restaurant.models.Menu;

@Service
public class MenuService {

    @Autowired
    MenuRepository menuRepository;

    public List<Menu> getAllMenus() {
        List<Menu> menus = menuRepository.findAll();
        for (Menu menu: menus) {
            List<Dish> menuDishes = menu.getDishes();
            if (menuDishes != null) {
                for(Dish dish: menuDishes) {
                    menu.setPrice(menu.getPrice() + dish.getPrice());
                }
            }
        }
        return menus;
    }

    public Menu create(Menu menu) {
        return menuRepository.save(menu);
    }

    public void delete(Long id) {
        menuRepository.deleteById(id);
    }
}
