package com.isge.ic3.gsn.restaurant.models;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private Double price;
    private String description;
    private String category;

    @ElementCollection
    private List<String> allergens;

    @Enumerated(EnumType.STRING)
    private DishStatus status;

    public enum DishStatus {
        DISPONIBLE, NON_DISPONIBLE
    }
}
