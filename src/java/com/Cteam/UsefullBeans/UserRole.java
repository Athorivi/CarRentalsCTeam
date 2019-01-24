/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Cteam.UsefullBeans;

/**
 *
 * @author User
 */
public class UserRole {
    
    private int id;
    private String username;
    private String rolename;

    public UserRole() {
    }

    public UserRole(int id, String username, String rolename) {
        this.id = id;
        this.username = username;
        this.rolename = rolename;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public String toString() {
        return "UserRole{" + "id=" + id + ", username=" + username + ", rolename=" + rolename + '}';
    }
    
    
    
    
}
