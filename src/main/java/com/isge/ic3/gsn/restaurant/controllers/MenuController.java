package com.isge.ic3.gsn.restaurant.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isge.ic3.gsn.restaurant.models.Menu;
import com.isge.ic3.gsn.restaurant.services.MenuService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/menus")
public class MenuController {

    @Autowired
    MenuService menuService;
    
    @GetMapping
    public List<Menu> getAllMenus() {
        return menuService.getAllMenus();
    }
    
    @PostMapping
    public Menu create(@RequestBody Menu menu) {
        return menuService.create(menu);
    }
    
    @DeleteMapping("/{id}")
    public void deleteMenuById(@PathVariable Long id) {
        menuService.delete(id);
    }
}
