/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Cteam.StaticBeans;

import com.Cteam.Tables.Car;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class CarResults {

    static private ArrayList<Car> carResults;

    public CarResults() {
    }

    public static ArrayList<Car> getCarResults() {
        return carResults;
    }

    public static void setCarResults(ArrayList<Car> aCarResults) {
        carResults = aCarResults;
    }

}
