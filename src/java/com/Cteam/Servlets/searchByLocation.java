package com.Cteam.Servlets;

import com.Cteam.DAO.CarDAO;
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

public class searchByLocation extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("mpike sto do post");
        String location = request.getParameter("location");
        String from = request.getParameter("from");
        String to = request.getParameter("to");
        CarDAO carDb = new CarDAO();
        List<Car> carList;
        System.out.println(location);
        System.out.println(from);
        System.out.println(to);
        if (location.isEmpty() && from.isEmpty() && to.isEmpty()) {
            carList = carDb.readCar();
        } else {
            

            carList = carDb.searchByLocation(location, from, to);
        }
        CarResults cr = new CarResults();

        CarResults.setCarResults((ArrayList<Car>) carList);
        System.out.println("mpike sto controller");
        for(Car x : CarResults.getCarResults()){
            System.out.println(x.toString());
        }

//        HttpSession session = request.getSession(false);
//        if (session != null) {
//            String username = (String) session.getAttribute("username");
//            System.out.println(username);

            request.getRequestDispatcher("results").forward(request, response);
//            response.sendRedirect("results");

//        
        }

    }

