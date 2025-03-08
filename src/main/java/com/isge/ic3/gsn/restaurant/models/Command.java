package com.isge.ic3.gsn.restaurant.models;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Command {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToAny
    private List<Dish> dishes;

    @Enumerated(EnumType.STRING)
    private CommandStatus status;

    public enum CommandStatus {
        EN_ATTENTE, EN_PREPARATION, PRETE, LIVREE
    }

    @ManyToOne
    private Client client;
}
