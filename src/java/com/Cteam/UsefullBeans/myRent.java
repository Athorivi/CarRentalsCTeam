package com.Cteam.UsefullBeans;

import java.util.Date;

public class myRent {
    
    static private Integer id;
    static private Date startDate;
    static private Date endDate;
    static private int userId;
    static private int carId;
    static private double totalPrice;

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer aId) {
        id = aId;
    }

    public static Date getStartDate() {
        return startDate;
    }

    public static void setStartDate(Date aStartDate) {
        startDate = aStartDate;
    }

    public static Date getEndDate() {
        return endDate;
    }

    public static void setEndDate(Date aEndDate) {
        endDate = aEndDate;
    }

    public static int getUserId() {
        return userId;
    }

    public static void setUserId(int aUserId) {
        userId = aUserId;
    }

    public static int getCarId() {
        return carId;
    }

    public static void setCarId(int aCarId) {
        carId = aCarId;
    }

    public static double getTotalPrice() {
        return totalPrice;
    }

    public static void setTotalPrice(double aTotalPrice) {
        totalPrice = aTotalPrice;
    }

    public myRent() {
    }
    
    
    
    
    
}
