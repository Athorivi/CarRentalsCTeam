/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Cteam.Servlets;
 
import com.Cteam.DAO.CarDAO;
import com.Cteam.Tables.Car;
import com.Cteam.UsefullBeans.CarStaticClass;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 *
 * @author herth
 */
public class viewRent extends HttpServlet {
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.valueOf(request.getParameter("id"));
        System.out.println("the id is");
        System.out.println(id);
        
        CarDAO carDb = new CarDAO();
        Car x;
        x = carDb.searchById(id);
        CarStaticClass cr = new CarStaticClass();
 

        
        CarStaticClass.setId(id);
        CarStaticClass.setOwner(x.getOwner());
        CarStaticClass.setModel(x.getModel());
        CarStaticClass.setLocation(x.getLocation());
        CarStaticClass.setBrand(x.getBrand());
        CarStaticClass.setKm(x.getKm());
        CarStaticClass.setFuel(x.getFuel());
        CarStaticClass.setCc(x.getCc());
        CarStaticClass.setPrice(x.getPrice());
        CarStaticClass.setCategories(x.getCategories());
        CarStaticClass.setReleaseDate(x.getReleaseDate());
        CarStaticClass.setColor(x.getColor());
        CarStaticClass.setPhoto(x.getPhoto());
        CarStaticClass.setBase64Image(x.getBase64Image());
        RequestDispatcher rd = request.getRequestDispatcher("viewRent.jsp");
        rd.forward(request, response);
 
        
    }
}
 