package com.Cteam.DAO;

import com.Cteam.Tables.Roles;
import com.Cteam.Interfaces.RoleInterface;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class RoleDAO implements RoleInterface {

    @Override
    public void createRole(Roles role) {

        try (Connection connection = Database.getConnection()) {
            String sql = new StringBuilder().append("INSER INTO `ROLES`")
                    .append("(`name`, `description`) VALUES(?, ?)").toString();
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, role.getName());
                statement.setString(2, role.getDescription());
                int rowsAffected = statement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Create a role");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList readRole() {

        ArrayList<Roles> readroles = null;
        try (Connection connection = Database.getConnection()) {
            String sql = "SELECT * FROM `ROLES` ;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                try (ResultSet resultset = statement.executeQuery()) {
                    if (resultset.next()) {
                        Roles role = new Roles();
                        role.setId(resultset.getInt(1));
                        role.setName(resultset.getString(2));
                        role.setDescription(resultset.getString(3));
                        System.out.println(role.toString());
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return readroles;
    }

    @Override
    public void updateRole(Roles role) {

        try (Connection connection = Database.getConnection()) {
            String sql = new StringBuilder().append("UPDATE INTO `ROLES` SET")
                    .append("(`name` = ?, `description` = ?) WHERE `id` = ?").toString();
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, role.getName());
                statement.setString(2, role.getDescription());
                statement.executeUpdate();
                System.out.println("The Role updated");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void deleteRole(Integer id) {

        try (Connection connection = Database.getConnection()) {
            String sql = "DELETE FROM `ROLES` WHERE `id` = ? ;";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id);
                statement.executeUpdate();
                System.out.println("The Role Deleted");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoleDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
