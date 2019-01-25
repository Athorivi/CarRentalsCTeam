/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Cteam.Servlets;

import com.Cteam.DAO.UserDAO;
import com.Cteam.DAO.UserRentCarDAO;
import com.Cteam.Tables.UserRentCar;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author User
 */
public class rent extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String from = request.getParameter("fromDate");
        String to = request.getParameter("toDate");

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MMM-dd");
        Date dateFrom = null;
        Date dateTo = null;

        try {
            dateFrom = formatter.parse(from);
            
            System.out.println(dateFrom);
            dateTo = formatter.parse(to);
        } catch (ParseException ex) {
            Logger.getLogger(rent.class.getName()).log(Level.SEVERE, null, ex);
        }

        String uname = null;
        HttpSession session = request.getSession(false);
        if (session != null) {
            uname = (String) session.getAttribute("username");
            System.out.println("Hello, " + uname + " Welcome to MyPosts");
        }

        UserDAO userDb = new UserDAO();
        int user_id = userDb.readUser(uname);

        int car_id = Integer.valueOf(request.getParameter("id"));
        System.out.println(car_id);

        UserRentCarDAO rentCar = new UserRentCarDAO();

        UserRentCar userRentCar = new UserRentCar();
        userRentCar.setStartDate(dateFrom);
        userRentCar.setEndDate(dateTo);
        userRentCar.setUserId(user_id);
        userRentCar.setCarId(car_id);

        rentCar.createUserRentCar(userRentCar);

        request.getRequestDispatcher("receipt.jsp").forward(request, response);
    }

}
