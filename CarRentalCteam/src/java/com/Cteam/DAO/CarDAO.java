/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Cteam.DAO;

import com.Cteam.Interfaces.CarInterface;
import com.Cteam.Tables.Car;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class CarDAO implements CarInterface {

    @Override
    public void createCar(Car car) {

        try (Connection connection = Database.getConnection()) {
            String sql = new StringBuilder()
                    .append("INSERT INTO `CARS`")
                    .append("`owner`, `model`, `location`, `brand`, `km`, `fuel`, `cc`, `price`, `categories`, `releaseDate`, `color`, `photo`)")
                    .append("VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ;").toString();

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, car.getOwner());
                statement.setString(2, car.getModel());
                statement.setString(3, car.getLocation());
                statement.setString(4, car.getBrand());
                statement.setLong(5, car.getKm());
                statement.setString(6, car.getFuel());
                statement.setInt(7, car.getCc());
                statement.setDouble(8, car.getPrice());
                statement.setString(9, car.getCategories());
                statement.setDate(10, (Date) car.getReleaseDate());
                statement.setString(11, car.getColor());
                statement.setBytes(12, car.getPhoto());
                int rowsAffected = statement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println(rowsAffected + "row(s) affected");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Car> readCar() {

        List<Car> cars = null;
        try (Connection connection = Database.getConnection()) {
            String sql = "SELECT * FROM `CARS` ;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                try (ResultSet resultset = statement.executeQuery()) {
                    while (resultset.next()) {
                        if (cars == null) {
                            cars = new ArrayList();
                        }
                        Car car = new Car();
                        car.setOwner(resultset.getInt(1));
                        car.setModel(resultset.getString(2));
                        car.setLocation(resultset.getString(3));
                        car.setBrand(resultset.getString(4));
                        car.setKm(resultset.getLong(5));
                        car.setFuel(resultset.getString(6));
                        car.setCc(resultset.getInt(7));
                        car.setPrice(resultset.getDouble(8));
                        car.setCategories(resultset.getString(9));
                        car.setReleaseDate(resultset.getDate(10));
                        car.setColor(resultset.getString(11));
                        car.setPhoto(resultset.getBytes(12));
                        cars.add(car);
                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cars;
    }

    @Override
    public void updateCar(Car car) {

        try (Connection connection = Database.getConnection()) {
            String sql = new StringBuilder().append("UPDATE `CARS`")
                    .append("SET `owner`= ?, `model` = ?,`location` = ?, `brand` = ?, `km` = ?, `fuel` = ?"
                            + ", `cc` = ?, `price` = ?, `categories` = ?, `releaseDate` = ?, `color` = ?, `photo` = ?)")
                    .append("WHERE  `id` = ? ;").toString();
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, car.getOwner());
                statement.setString(2, car.getModel());
                statement.setString(3, car.getLocation());
                statement.setString(4, car.getBrand());
                statement.setLong(5, car.getKm());
                statement.setString(6, car.getFuel());
                statement.setInt(7, car.getCc());
                statement.setDouble(8, car.getPrice());
                statement.setString(9, car.getCategories());
                statement.setDate(10, (Date) car.getReleaseDate());
                statement.setString(11, car.getColor());
                statement.setBytes(12, car.getPhoto());
                int rowsAffected = statement.executeUpdate();
                System.out.println("The car was successfully updated");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteCar(Integer id) {

        try (Connection connection = Database.getConnection()) {
            String sql = "DELETE FROM `CARS` WHERE `id` = ? ;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id);
                statement.executeUpdate();
                System.out.println("The car Deleted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Car> searchByLocation(String location, String from, String to) {

        List<Car> cars = null;
        try (Connection connection = Database.getConnection()) {
            String sql = "select * from CARS\n"
                    + "INNER JOIN USERS_RENT_CARS\n"
                    + "on CARS.id = USERS_RENT_CARS.car_id\n"
                    + "having CARS.location = ? AND USERS_RENT_CARS.endDate < ? ;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, location);
                statement.setString(2, from);
                try (ResultSet resultset = statement.executeQuery()) {
                    while (resultset.next()) {
                        if (cars == null) {
                            cars = new ArrayList();
                        }
                        Car car = new Car();
                        car.setId(resultset.getInt(1));
                        car.setOwner(resultset.getInt(2));
                        car.setModel(resultset.getString(3));
                        car.setLocation(resultset.getString(4));
                        car.setBrand(resultset.getString(5));
                        car.setKm(resultset.getLong(6));
                        car.setFuel(resultset.getString(7));
                        car.setCc(resultset.getInt(8));
                        car.setPrice(resultset.getDouble(9));
                        car.setCategories(resultset.getString(10));
                        car.setReleaseDate(resultset.getDate(11));
                        car.setColor(resultset.getString(12));
                        car.setPhoto(resultset.getBytes(13));
                        cars.add(car);
                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cars;
    }

}
