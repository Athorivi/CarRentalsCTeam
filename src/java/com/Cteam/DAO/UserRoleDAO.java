package com.Cteam.DAO;

import com.Cteam.Tables.UsersRoles;
import com.Cteam.Interfaces.UserRoleInterface;
import com.Cteam.UsefullBeans.UserRole;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserRoleDAO implements UserRoleInterface {

    @Override
    public void createUserRole(UsersRoles usersRoles) {

        try (Connection connection = Database.getConnection()) {
            String sql = new StringBuilder()
                    .append("INSERT INTO `USERS_ROLES`")
                    .append("`userId`, `roleId`)")
                    .append("VALUES(?, ?) ;").toString();

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, usersRoles.getUserId());
                statement.setInt(2, usersRoles.getRoleId());

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
    public ArrayList<UsersRoles> readUserRole() {

        ArrayList<UsersRoles> usersRoles = null;
        try (Connection connection = Database.getConnection()) {
            String sql = "SELECT * FROM `USERS_ROLES` ;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                try (ResultSet resultset = statement.executeQuery()) {
                    while (resultset.next()) {
                        if (usersRoles == null) {
                            usersRoles = new ArrayList();
                        }
                        UsersRoles userRole = null;
                        userRole.setUserId(resultset.getInt(1));
                        userRole.setRoleId(resultset.getInt(2));
                        usersRoles.add(userRole);
                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usersRoles;

    }

    @Override
    public void updateUserRole(UsersRoles userRole) {

        try (Connection connection = Database.getConnection()) {
            String sql = new StringBuilder()
                    .append("UPDATE `USERS_ROLES` ")
                    .append("SET  `role_Id` = ? ")
                    .append("WHERE  `user_Id`= ? ;").toString();
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, userRole.getUserId());
                statement.setInt(2, userRole.getRoleId());
                int rowsAffected = statement.executeUpdate();
                System.out.println("The car was successfully updated");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void deleteUserRole(UsersRoles userRole) {

        try (Connection connection = Database.getConnection()) {
            String sql = "DELETE FROM `USERS_ROLES` WHERE `id` = ? ;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, userRole.getId());
                statement.executeUpdate();
                System.out.println("The User with the role was deleted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<UserRole> readUserRoleInner() {

        ArrayList<UserRole> usersRoles = new ArrayList();
        try (Connection connection = Database.getConnection()) {
            String sql = "SELECT `USERS`.`id`, `USERS`.`username`, `ROLES`.`name` \n"
                    + "FROM `USERS_ROLES`\n"
                    + "INNER JOIN `USERS`\n"
                    + "ON `USERS`.`id` = `USERS_ROLES`.`user_id`\n"
                    + "INNER JOIN `ROLES`\n"
                    + "ON `ROLES`.`id` = `USERS_ROLES`.`role_id`;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                try (ResultSet resultset = statement.executeQuery()) {
                    while (resultset.next()) {

                        UserRole userRole = new UserRole();
                        userRole.setId(resultset.getInt(1));
                        userRole.setUsername(resultset.getString(2));
                        userRole.setRolename(resultset.getString(3));
                        
                        usersRoles.add(userRole);
                    }
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(CarDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usersRoles;

    }

}
