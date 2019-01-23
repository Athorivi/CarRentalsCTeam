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
public class staticRentResults {

    static private ArrayList<myRentsResults> rentsResults;

    public staticRentResults() {
    }

    public static ArrayList<myRentsResults> getRentsResults() {
        return rentsResults;
    }

    public static void setRentsResults(ArrayList<myRentsResults> aRentsResults) {
        rentsResults = aRentsResults;
    }

}
