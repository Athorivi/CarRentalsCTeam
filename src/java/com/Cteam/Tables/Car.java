package com.Cteam.Tables;

import java.io.InputStream;
import java.util.Date;

public class Car {

    private int id;
    private int owner;
    private String model;
    private String location;
    private String brand;
    private long km;
    private String fuel;
    private int cc;
    private double price;
    private String categories;
    private Date releaseDate;
    private String color;
    private InputStream photo;

    public Car() {
    }

    public Car(int id, int owner, String model, String location, String brand, long km, String fuel, int cc, double price, String categories, Date releaseDate, String color, InputStream photo) {
        this.id = id;
        this.owner = owner;
        this.model = model;
        this.location = location;
        this.brand = brand;
        this.km = km;
        this.fuel = fuel;
        this.cc = cc;
        this.price = price;
        this.categories = categories;
        this.releaseDate = releaseDate;
        this.color = color;
        this.photo = photo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwner() {
        return owner;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getKm() {
        return km;
    }

    public void setKm(long km) {
        this.km = km;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public InputStream getPhoto() {
        return photo;
    }

    public void setPhoto(InputStream photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", owner=" + owner + ", model=" + model + ", location=" + location + ", brand=" + brand + ", km=" + km + ", fuel=" + fuel + ", cc=" + cc + ", price=" + price + ", categories=" + categories + ", releaseDate=" + releaseDate + ", color=" + color + ", photo=" + photo + '}';
    }

}
