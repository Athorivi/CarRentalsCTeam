/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Cteam.Servlets;

import com.Cteam.DAO.CarDAO;
import com.Cteam.DAO.UserDAO;
import com.Cteam.StaticBeans.CarResults;
import com.Cteam.Tables.Car;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class viewMyPosts extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uname = null;
        HttpSession session = request.getSession(false);
        if (session != null) {
            uname = (String) session.getAttribute("username");
            System.out.println("Hello, " + uname + " Welcome to MyPosts");
        }

        UserDAO userDb = new UserDAO();
        int id = userDb.readUser(uname);
        CarDAO carDb = new CarDAO();
        List<Car> carList;
        carList = carDb.searchByOwner(id);
        CarResults cr = new CarResults();
        CarResults.setCarResults((ArrayList<Car>) carList);
        
        
        
        
        request.getRequestDispatcher("myPosts").forward(request, response);
    }

}
