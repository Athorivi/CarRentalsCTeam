package com.Cteam.Tables;

import java.util.Date;

public class UserRentCar {

    private Integer id;
    private Date startDate;
    private Date endDate;
    private int userId;
    private int carId;
    private double totalPrice;

    public UserRentCar() {
    }

    public UserRentCar(Integer id, Date startDate, Date endDate, int userId, int carId, double totalPrice) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.userId = userId;
        this.carId = carId;
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    @Override
    public String toString() {
        return "UsersRentCars{" + "id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", userId=" + userId + ", carId=" + carId + '}';
    }

}
