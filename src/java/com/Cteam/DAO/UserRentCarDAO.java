package com.Cteam.DAO;

import com.Cteam.Tables.UserRentCar;
import com.Cteam.Interfaces.UserRentCarInterface;
import com.Cteam.UsefullBeans.myRent;
import com.Cteam.UsefullBeans.myRentsResults;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserRentCarDAO implements UserRentCarInterface {

    @Override
    public void createUserRentCar(UserRentCar userRentCar) {

        try (Connection connection = Database.getConnection()) {
            String sql = new StringBuilder()
                    .append("INSERT INTO `USERS_RENT_CARS` ")
                    .append("(`startDate`, `endDate`, `user_Id`, `car_Id`, `totalPrice`) ")
                    .append("VALUES(?, ?, ?, ?, ?) ;").toString();
            System.out.println(sql);
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setDate(1, (Date) userRentCar.getStartDate());
                statement.setDate(2, (Date) userRentCar.getEndDate());
                statement.setInt(3, userRentCar.getUserId());
                statement.setInt(4, userRentCar.getCarId());
                statement.setDouble(5, userRentCar.getTotalPrice());

                int rowsAffected = statement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println(rowsAffected + "row(s) affected");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserRoleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public ArrayList<UserRentCar> readUserRentCar() {

        ArrayList<UserRentCar> usersRentCars = null;
        try (Connection connection = Database.getConnection()) {
            String sql = "SELECT * FROM `USERS_RENT_CARS` ;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                try (ResultSet resultset = statement.executeQuery()) {
                    while (resultset.next()) {
                        if (usersRentCars == null) {
                            usersRentCars = new ArrayList();
                        }
                        UserRentCar userRentCar = null;
                        userRentCar.setStartDate(resultset.getDate(1));
                        userRentCar.setEndDate(resultset.getDate(2));
                        userRentCar.setUserId(resultset.getInt(3));
                        userRentCar.setCarId(resultset.getInt(4));
                        userRentCar.setTotalPrice(resultset.getDouble(5));
                        usersRentCars.add(userRentCar);
                    }
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserRentCarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usersRentCars;
    }

    @Override
    public void updateUserRentCar(UserRentCar userRentCar) {

        try (Connection connection = Database.getConnection()) {
            String sql = new StringBuilder()
                    .append("UPDATE `USERS_RENT_CARS`")
                    .append("SET `startDate`= ?, `endDate` = ?, `userId` = ?, `carId` = ?, `totalPrice = ?")
                    .append("WHERE  `id` = ? ;").toString();
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setDate(1, (Date) userRentCar.getStartDate());
                statement.setDate(2, (Date) userRentCar.getEndDate());
                statement.setInt(3, userRentCar.getUserId());
                statement.setDouble(4, userRentCar.getTotalPrice());
                statement.setInt(5, userRentCar.getCarId());
                int rowsAffected = statement.executeUpdate();
                System.out.println("The car was successfully updated");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteUserRentCar(int car_id) {

        try (Connection connection = Database.getConnection()) {
            String sql = "DELETE FROM `USERS_RENT_CARS` WHERE `car_id` = ? ;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, car_id);
                statement.executeUpdate();
                System.out.println("The User with the car was deleted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<myRentsResults> readUserRentCar(int id) {

        ArrayList<myRentsResults> userRentCars = new ArrayList<>();
        try (Connection connection = Database.getConnection()) {
            String sql = "select `USERS_RENT_CARS`.`id`, `user_id`, `car_id`, `brand`, `model`, `releaseDate`, `categories`, `location`, `startDate`, `endDate`, `photo` from `USERS_RENT_CARS` \n"
                    + "INNER JOIN `CARS`\n"
                    + "ON `CARS`.`id` = `USERS_RENT_CARS`.`car_id`\n"
                    + "having `USERS_RENT_CARS`.`user_id` = ? ;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id);
                try (ResultSet resultset = statement.executeQuery()) {
                    while (resultset.next()) {

                        myRentsResults rentResult = new myRentsResults();
                        rentResult.setId(resultset.getInt(1));
                        rentResult.setUser_id(resultset.getInt(2));
                        rentResult.setCar_id(resultset.getInt(3));
                        rentResult.setBrand(resultset.getString(4));
                        rentResult.setModel(resultset.getString(5));
                        rentResult.setReleaseDate(resultset.getDate(6));
                        rentResult.setCategories(resultset.getString(7));
                        rentResult.setLocation(resultset.getString(8));
                        rentResult.setStartDate(resultset.getDate(9));
                        rentResult.setEndDate(resultset.getDate(10));
                        rentResult.setPhoto(resultset.getBlob(11).getBinaryStream());

                        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                        byte[] buffer = new byte[4096];
                        int bytesRead = -1;

                        while ((bytesRead = rentResult.getPhoto().read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }

                        byte[] imageBytes = outputStream.toByteArray();

                        rentResult.setBase64Image(Base64.getEncoder().encodeToString(imageBytes));

                        userRentCars.add(rentResult);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(UserRentCarDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserRentCarDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserRentCarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userRentCars;
    }

    public void readRent(int id) {
        try (Connection connection = Database.getConnection()) {
            String sql = "SELECT * FROM `USERS_RENT_CARS` WHERE `id`= ?;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id);
                try (ResultSet resultset = statement.executeQuery()) {
                    if (resultset.first()) {
                        myRent.setId(resultset.getInt(1));
                        myRent.setUserId(resultset.getInt(2));
                        myRent.setCarId(resultset.getInt(3));
                        myRent.setStartDate(resultset.getDate(4));
                        myRent.setEndDate(resultset.getDate(5));
                        myRent.setTotalPrice(resultset.getDouble(6));
                        
                    }
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserRentCarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
