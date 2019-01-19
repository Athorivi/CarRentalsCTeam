package com.Cteam.StaticBeans;

import java.util.Date;

public class CarStaticClass {

    static private int id;
    static private int owner;
    static private String model;
    static private String location;
    static private String brand;
    static private long km;
    static private String fuel;
    static private int cc;
    static private double price;
    static private String categories;
    static private Date releaseDate;
    static private String color;
    static private byte[] photo;

    public CarStaticClass() {
    }

    public static int getId() {
        return id;
    }

    public static void setId(int aId) {
        id = aId;
    }

    public static int getOwner() {
        return owner;
    }

    public static void setOwner(int aOwner) {
        owner = aOwner;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String aModel) {
        model = aModel;
    }

    public static String getLocation() {
        return location;
    }

    public static void setLocation(String aLocation) {
        location = aLocation;
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String aBrand) {
        brand = aBrand;
    }

    public static long getKm() {
        return km;
    }

    public static void setKm(long aKm) {
        km = aKm;
    }

    public static String getFuel() {
        return fuel;
    }

    public static void setFuel(String aFuel) {
        fuel = aFuel;
    }

    public static int getCc() {
        return cc;
    }

    public static void setCc(int aCc) {
        cc = aCc;
    }

    public static double getPrice() {
        return price;
    }

    public static void setPrice(double aPrice) {
        price = aPrice;
    }

    public static String getCategories() {
        return categories;
    }

    public static void setCategories(String aCategories) {
        categories = aCategories;
    }

    public static Date getReleaseDate() {
        return releaseDate;
    }

    public static void setReleaseDate(Date aReleaseDate) {
        releaseDate = aReleaseDate;
    }

    public static String getColor() {
        return color;
    }

    public static void setColor(String aColor) {
        color = aColor;
    }

    public static byte[] getPhoto() {
        return photo;
    }

    public static void setPhoto(byte[] aPhoto) {
        photo = aPhoto;
    }

}
