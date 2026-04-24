package com.cg.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vaccinations")
public class Vaccination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vaccinationId;

    private String name;

    private String description;

    private double price;

    private boolean available;

    public Vaccination() {}

    public Vaccination(String name, String description, double price, boolean available) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.available = available;
    }

    // getters and setters

    public int getVaccinationId() {
        return vaccinationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}