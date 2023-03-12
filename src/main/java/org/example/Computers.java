package org.example;

import java.util.Set;

public abstract class Computers {
    String brand;
    String model;
    Double screenSize;
    Double ROM;
    Double price;
    public abstract void filterPC();
    public abstract void filterPC(Set<Laptop> setLT1, int parameter1);

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    public Double getROM() {
        return ROM;
    }

    public void setROM(Double ROM) {
        this.ROM = ROM;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Computers(String brand, String model, Double screenSize, Double ROM, Double price) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.ROM = ROM;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computers{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", ROM=" + ROM +
                ", price=" + price +
                '}';
    }

}
