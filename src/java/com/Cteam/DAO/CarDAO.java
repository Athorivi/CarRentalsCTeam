/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Cteam.DAO;

import com.Cteam.Interfaces.CarInterface;
import com.Cteam.Tables.Car;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Base64;
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
                    .append("INSERT INTO `CARS` ")
                    .append("(`owner`, `model`, `location`, `brand`, `km`, `fuel`, `cc`, `price`, `categories`, `releaseDate`, `color`, `photo`)")
                    .append("VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ;").toString();
            System.out.println(sql);
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
                statement.setBlob(12, car.getPhoto());
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
    public ArrayList<Car> readCar() {

        ArrayList<Car> cars = null;
        try (Connection connection = Database.getConnection()) {
            String sql = "SELECT * FROM `CARS` ;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
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
                        car.setPhoto(resultset.getBlob(13).getBinaryStream());

                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        byte[] buffer = new byte[4096];
                        int bytesRead = -1;

                        while ((bytesRead = car.getPhoto().read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }

                        byte[] imageBytes = outputStream.toByteArray();

                        car.setBase64Image(Base64.getEncoder().encodeToString(imageBytes));

                        cars.add(car);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
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
                statement.setBlob(12, car.getPhoto());
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
                int rowsAffected = statement.executeUpdate();
                System.out.println(rowsAffected + "The car Deleted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Car> searchByLocation(String location, String startDate, String endDate) {

        ArrayList<Car> cars = null;
        try (Connection connection = Database.getConnection()) {
            String sql = "SELECT * FROM cteam.CARS WHERE `location` = ? \n"
                    + "AND CARS.`id` NOT IN(SELECT `car_id` FROM cteam.USERS_RENT_CARS "
                    + "WHERE `startDate` = ? AND `endDate` = ?) ;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, location);
                statement.setString(2, startDate);
                statement.setString(3, endDate);
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
                        car.setPhoto(resultset.getBlob(13).getBinaryStream());
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        byte[] buffer = new byte[4096];
                        int bytesRead = -1;

                        while ((bytesRead = car.getPhoto().read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }

                        byte[] imageBytes = outputStream.toByteArray();

                        car.setBase64Image(Base64.getEncoder().encodeToString(imageBytes));

                        cars.add(car);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cars;
    }

    public ArrayList<Car> searchByOwner(int ownerID) {

        ArrayList<Car> cars = null;
        try (Connection connection = Database.getConnection()) {
            String sql = "select * from CARS WHERE `owner`= ?;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, ownerID);
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
                        car.setPhoto(resultset.getBlob(13).getBinaryStream());
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        byte[] buffer = new byte[4096];
                        int bytesRead = -1;

                        while ((bytesRead = car.getPhoto().read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }

                        byte[] imageBytes = outputStream.toByteArray();

                        car.setBase64Image(Base64.getEncoder().encodeToString(imageBytes));

                        cars.add(car);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cars;
    }

    public ArrayList<Car> searchByCategory(String categories) {

        ArrayList<Car> cars = null;
        try (Connection connection = Database.getConnection()) {
            String sql = "select * from CARS WHERE `categories`= ?;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, categories);
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
                        car.setPhoto(resultset.getBlob(13).getBinaryStream());
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        byte[] buffer = new byte[4096];
                        int bytesRead = -1;

                        while ((bytesRead = car.getPhoto().read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }

                        byte[] imageBytes = outputStream.toByteArray();

                        car.setBase64Image(Base64.getEncoder().encodeToString(imageBytes));

                        cars.add(car);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cars;
    }

    public ArrayList<Car> searchByCc(String from, String to) {

        ArrayList<Car> cars = new ArrayList<>();
        try (Connection connection = Database.getConnection()) {
            String sql = "select * from CARS WHERE `cc` >= ? AND `cc` <= ? ;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, from);
                statement.setString(2, to);
                try (ResultSet resultset = statement.executeQuery()) {
                    while (resultset.next()) {

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
                        car.setPhoto(resultset.getBlob(13).getBinaryStream());
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        byte[] buffer = new byte[4096];
                        int bytesRead = -1;

                        while ((bytesRead = car.getPhoto().read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }

                        byte[] imageBytes = outputStream.toByteArray();

                        car.setBase64Image(Base64.getEncoder().encodeToString(imageBytes));
                        System.out.println(car.toString());

                        cars.add(car);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cars;
    }

    public ArrayList<Car> searchByPrice(String from, String to) {

        ArrayList<Car> cars = new ArrayList();
        try (Connection connection = Database.getConnection()) {
            String sql = "select * from CARS WHERE `price` >= ? AND `price` <= ? ;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, from);
                statement.setString(2, to);
                try (ResultSet resultset = statement.executeQuery()) {
                    while (resultset.next()) {

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
                        car.setPhoto(resultset.getBlob(13).getBinaryStream());
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        byte[] buffer = new byte[4096];
                        int bytesRead = -1;

                        while ((bytesRead = car.getPhoto().read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }

                        byte[] imageBytes = outputStream.toByteArray();

                        car.setBase64Image(Base64.getEncoder().encodeToString(imageBytes));

                        cars.add(car);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cars;
    }

    public Car searchById(int id) {
        Car car = new Car();
        try (Connection connection = Database.getConnection()) {
            String sql = "select * from CARS WHERE `id`= ? ;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id);
                try (ResultSet resultset = statement.executeQuery()) {
                    while (resultset.next()) {

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
                        car.setPhoto(resultset.getBlob(13).getBinaryStream());
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        byte[] buffer = new byte[4096];
                        int bytesRead = -1;

                        while ((bytesRead = car.getPhoto().read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }

                        byte[] imageBytes = outputStream.toByteArray();

                        car.setBase64Image(Base64.getEncoder().encodeToString(imageBytes));

                    }
                } catch (IOException ex) {
                    Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return car;
    }

    public ArrayList<Car> searchByDates(String from, String to) {

        ArrayList<Car> cars = null;
        try (Connection connection = Database.getConnection()) {
            String sql = "SELECT * FROM cteam.CARS WHERE  \n"
                    + "                   CARS.`id` NOT IN(SELECT `car_id` FROM cteam.USERS_RENT_CARS\n"
                    + "                    WHERE `startDate` = ? AND `endDate` = ?) ;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, from);
                statement.setString(2, to);
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
                        car.setPhoto(resultset.getBlob(13).getBinaryStream());
                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        byte[] buffer = new byte[4096];
                        int bytesRead = -1;

                        while ((bytesRead = car.getPhoto().read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }

                        byte[] imageBytes = outputStream.toByteArray();

                        car.setBase64Image(Base64.getEncoder().encodeToString(imageBytes));

                        cars.add(car);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cars;
    }

    public ArrayList<String> getCategories() {

        ArrayList<String> categories = new ArrayList();;
        try (Connection connection = Database.getConnection()) {
            String sql = "select DISTINCT categories from CARS;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                try (ResultSet resultset = statement.executeQuery()) {
                    while (resultset.next()) {
                        categories.add(resultset.getString(1));
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categories;
    }

}
