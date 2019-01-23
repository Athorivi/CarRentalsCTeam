/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Cteam.Servlets;

import com.Cteam.DAO.CarDAO;
import com.Cteam.DAO.UserDAO;
import com.Cteam.Tables.Car;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author User
 */
@MultipartConfig(maxFileSize = 16177215)
public class postCar extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uname = null;
        HttpSession session = request.getSession(false);
        if (session != null) {
            uname = (String) session.getAttribute("username");
//            System.out.println("Hello, " + ses + " Welcome to Profile");
        }
        UserDAO userDb = new UserDAO();
        int id = userDb.readUser(uname);
        Car car = new Car();
        car.setOwner(id);
        car.setModel(request.getParameter("model"));
        car.setLocation(request.getParameter("location"));
        car.setBrand(request.getParameter("brand"));
        car.setKm(Long.valueOf(request.getParameter("km")));
        car.setFuel(request.getParameter("fuel"));
        car.setCc(Integer.valueOf(request.getParameter("cc")));
        car.setPrice(Double.valueOf(request.getParameter("price")));
        car.setCategories(request.getParameter("category"));
        car.setReleaseDate(Date.valueOf(request.getParameter("releaseDate")));
        car.setColor(request.getParameter("color"));

        InputStream inputStream = null; // input stream of the upload file

        // obtains the upload file part in this multipart request
        Part filePart = request.getPart("uploadPhoto");

        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());

            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();

        }
        car.setPhoto(inputStream);
        System.out.println(car.toString());
        CarDAO carDb = new CarDAO();
        carDb.createCar(car);
        
        
        
            response.sendRedirect("viewMyPosts");

    }
}
