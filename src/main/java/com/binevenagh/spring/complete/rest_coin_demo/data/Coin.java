package com.binevenagh.spring.complete.rest_coin_demo.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;

import java.util.Objects;

/**
 * Represents a coin entity with various attributes.
 *
 * @author danieldevlin
 * @date 02/04/2025
 * @project rest-coin-demo
 */
@Entity
public class Coin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @DecimalMin(value = "0.1", message = "Weight must be greater than or equal to 0.1")
    private Double weight;

    @NotBlank(message = "Description is mandatory")
    private String description;

    @DecimalMin(value = "0.1", message = "Fineness must be greater than or equal to 0.1")
    private Double fineness;

    @Pattern(regexp = "gold|silver|platinum", message = "Metal must be either gold, silver, or platinum")
    private String metal;

    public Coin() {
    }

    public Coin(Double weight, String description, Double fineness, String metal) {
        this.weight = weight;
        this.description = description;
        this.fineness = fineness;
        this.metal = metal.toLowerCase();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getFineness() {
        return fineness;
    }

    public void setFineness(Double fineness) {
        this.fineness = fineness;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal.toLowerCase();
    }
}