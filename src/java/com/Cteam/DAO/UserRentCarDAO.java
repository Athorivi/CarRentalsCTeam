package com.Cteam.DAO;

import com.Cteam.Tables.UserRentCar;
import com.Cteam.Interfaces.UserRentCarInterface;
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

}
