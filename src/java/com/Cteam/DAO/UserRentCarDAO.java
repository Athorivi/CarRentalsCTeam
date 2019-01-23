package com.Cteam.DAO;

import com.Cteam.Tables.UserRentCar;
import com.Cteam.Interfaces.UserRentCarInterface;
import com.Cteam.UsefullBeans.myRentsResults;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserRentCarDAO implements UserRentCarInterface {

    @Override
    public void createUserRentCar(UserRentCar userRentCar) {

        try (Connection connection = Database.getConnection()) {
            String sql = new StringBuilder()
                    .append("INSERT INTO `USERS_RENT_CARS`")
                    .append("`startDate`, `endDate`, `userId`, `carId`)")
                    .append("VALUES(?, ?, ?, ?) ;").toString();

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setDate(1, (Date) userRentCar.getStartDate());
                statement.setDate(2, (Date) userRentCar.getEndDate());
                statement.setInt(3, userRentCar.getUserId());
                statement.setInt(4, userRentCar.getCarId());

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
                    .append("SET `startDate`= ?, `endDate` = ?, `userId` = ?, `carId` = ?")
                    .append("WHERE  `id` = ? ;").toString();
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setDate(1, (Date) userRentCar.getStartDate());
                statement.setDate(2, (Date) userRentCar.getEndDate());
                statement.setInt(3, userRentCar.getUserId());
                statement.setInt(4, userRentCar.getCarId());
                int rowsAffected = statement.executeUpdate();
                System.out.println("The car was successfully updated");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteUserRentCar(UserRentCar userRentCar) {

        try (Connection connection = Database.getConnection()) {
            String sql = "DELETE FROM `USERS_RENT_CARS` WHERE `id` = ? ;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, userRentCar.getId());
                statement.executeUpdate();
                System.out.println("The User with the car was deleted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<myRentsResults> readUserRentCar(int id) {

        ArrayList<myRentsResults> userRentCars = new ArrayList<myRentsResults>();
        try (Connection connection = Database.getConnection()) {
            String sql = "select `user_id`, `brand`, `model`, `releaseDate`, `categories`, `location`, `startDate`, `endDate`, `photo` from `USERS_RENT_CARS` \n"
                    + "INNER JOIN `CARS`\n"
                    + "ON `CARS`.`id` = `USERS_RENT_CARS`.`car_id`\n"
                    + "having `USERS_RENT_CARS`.`user_id` = ? ;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id);
                try (ResultSet resultset = statement.executeQuery()) {
                    while (resultset.next()) {

                        myRentsResults rentResult = new myRentsResults();
                        rentResult.setUser_id(resultset.getInt(1));
                        rentResult.setBrand(resultset.getString(2));
                        rentResult.setModel(resultset.getString(3));
                        rentResult.setReleaseDate(resultset.getDate(4));
                        rentResult.setCategories(resultset.getString(5));
                        rentResult.setLocation(resultset.getString(6));
                        rentResult.setStartDate(resultset.getDate(7));
                        rentResult.setEndDate(resultset.getDate(8));
                        rentResult.setPhoto(resultset.getBlob(9).getBinaryStream());
                        userRentCars.add(rentResult);

                    }
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserRentCarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userRentCars;
    }

}
