package com.cg.carrentals.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class RentalCar {

    @Id
    private int id;
    private String carName;
    private String model;
    private double price;

    public RentalCar() {}

    public RentalCar(int id,String carName,String model,double price){
        this.id=id;
        this.carName=carName;
        this.model=model;
        this.price=price;
    }

    public int getId() { return id; }
    public String getCarName() { return carName; }
    public String getModel() { return model; }
    public double getPrice() { return price; }

    public void setId(int id) { this.id=id; }
    public void setCarName(String carName) { this.carName=carName; }
    public void setModel(String model) { this.model=model; }
    public void setPrice(double price) { this.price=price; }
}