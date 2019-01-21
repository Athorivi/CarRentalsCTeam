package com.Cteam.DAO;

import com.Cteam.Interfaces.UserInterface;
import com.Cteam.Tables.User;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.Part;

public class UserDAO implements UserInterface {

    @Override
    public int createUser(User user) {
        try (Connection connection = Database.getConnection()) {
            String sql = new StringBuilder().append("INSERT INTO `USERS`")
                    .append("(`username`, `password`, `fname`, `lname`, `dob`, `email`, `address`, `phone`, `photo`)")
                    .append("VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)").toString();
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, user.getUsername());
                statement.setString(2, user.getPassword());
                statement.setString(3, user.getFname());
                statement.setString(4, user.getLname());
                statement.setString(5, user.getDob());
                statement.setString(6, user.getEmail());
                statement.setString(7, user.getAddress());
                statement.setString(8, user.getPhone());
                statement.setBlob(9, (InputStream) user.getPhoto());
                int rowsAffected = statement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("1 row affected");
                    return rowsAffected;
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    @Override
    public ArrayList<User> readUser(Integer id) {
        ArrayList<User> users = new ArrayList<>();
        try (Connection connection = Database.getConnection()) {
            String sql = "SELECT * FROM `USERS` WHERE `id` = ? ;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id);
                try (ResultSet resultset = statement.executeQuery()) {
                    while (resultset.next()) {
                        User user = new User();
                        user.setId(resultset.getInt(1));
                        user.setUsername(resultset.getString(2));
                        user.setPassword(resultset.getString(3));
                        user.setFname(resultset.getString(4));
                        user.setLname(resultset.getString(5));
                        user.setDob(resultset.getString(6));
                        user.setEmail(resultset.getString(7));
                        user.setAddress(resultset.getString(8));
                        user.setPhone(resultset.getString(9));
                        user.setPhoto((InputStream) resultset.getBlob(10));
                        System.out.println(user.toString());
                        users.add(user);
                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

    @Override
    public void updateUser(User user) {

        try (Connection connection = Database.getConnection()) {
            String sql = new StringBuilder().append("INSERT INTO `USERS` SET")
                    .append("`username` = ?, `password` = ?, `fname` = ?, "
                            + "`lname` = ?, `dob` = ?, `email` = ?, `address` = ?, `phone` ?, `photo` = ? WHERE `id` = ? ;").toString();
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, user.getUsername());
                statement.setString(2, user.getPassword());
                statement.setString(3, user.getFname());
                statement.setString(4, user.getLname());
                statement.setString(5, user.getDob());
                statement.setString(6, user.getEmail());
                statement.setString(7, user.getAddress());
                statement.setString(8, user.getPhone());
                statement.setBlob(9, (Blob) user.getPhoto());
                statement.executeUpdate();
                System.out.println("The User was successfully Updated");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void deleteUser(Integer id) {

        try (Connection connection = Database.getConnection()) {
            String sql = "DELETE FROM `USERS` WHERE `id` = ? ;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id);
                statement.executeUpdate();
                System.out.println("The User Deleted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<User> AllUsers() {

        List<User> users = null;
        try (Connection connection = Database.getConnection()) {
            String sql = "SELECT * FROM `USERS`;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                try (ResultSet resultset = statement.executeQuery()) {
                    while (resultset.next()) {
                        if (users == null) {
                            users = new ArrayList();
                        }
                        User user = new User();
                        user.setId(resultset.getInt(1));
                        user.setUsername(resultset.getString(2));
                        user.setPassword(resultset.getString(3));
                        user.setFname(resultset.getString(4));
                        user.setLname(resultset.getString(5));
                        user.setDob(resultset.getString(6));
                        user.setEmail(resultset.getString(7));
                        user.setAddress(resultset.getString(8));
                        user.setPhone(resultset.getString(9));
                        user.setPhoto((InputStream) resultset.getBlob(10));
                        users.add(user);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

    public boolean checkLogin(String username, String password) {

        try (Connection connection = Database.getConnection()) {
            String sql = "SELECT * FROM `USERS` WHERE `username` = ? AND `password` = ? ";
            System.out.println("mpike sto sql");
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, username);
                statement.setString(2, password);
                System.out.println("kanei to set");
                try (ResultSet resultset = statement.executeQuery()) {
                    System.out.println("resultset");
                    if (resultset.first()) {
                        System.out.println("while");
                        System.out.println(resultset.getString(1));
                        return true;
                    }
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
