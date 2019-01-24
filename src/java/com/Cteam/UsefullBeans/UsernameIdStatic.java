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
public class UsernameIdStatic {

    static private ArrayList<UsernameId> list;

    public static ArrayList<UsernameId> getList() {
        return list;
    }

    public static void setList(ArrayList<UsernameId> aList) {
        list = aList;
    }

    public UsernameIdStatic() {
    }

}
