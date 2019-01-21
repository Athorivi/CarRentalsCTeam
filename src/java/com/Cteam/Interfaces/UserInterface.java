/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Cteam.Interfaces;

import com.Cteam.Tables.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public interface UserInterface {

    public int createUser(User user);

    public ArrayList<User> readUser(Integer id);

    public void updateUser(User user);

    public void deleteUser(Integer id);

    public List<User> AllUsers();
}
