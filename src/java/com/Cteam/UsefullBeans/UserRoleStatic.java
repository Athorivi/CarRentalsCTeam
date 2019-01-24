/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Cteam.UsefullBeans;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class UserRoleStatic {
    static private ArrayList<UserRole> userRole;

    public static ArrayList<UserRole> getUserRole() {
        return userRole;
    }

    public static void setUserRole(ArrayList<UserRole> aUserRole) {
        userRole = aUserRole;
    }

    public UserRoleStatic() {
    }
    
    
    
    
    
    
}
