/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Cteam.Servlets;

import com.Cteam.Tables.Car;
import com.Cteam.UsefullBeans.CarResults;
import com.Cteam.UsefullBeans.CarStaticClass;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class editPosts extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.valueOf(request.getParameter("id"));
        System.out.println("the id is");
        System.out.println(id);
        for (Car x : CarResults.getCarResults()) {
            if (id == x.getId()) {
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
//
//                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//                byte[] buffer = new byte[4096];
//                int bytesRead = -1;
//
//                while ((bytesRead = CarStaticClass.getPhoto().read(buffer)) != -1) {
//                    outputStream.write(buffer, 0, bytesRead);
//                }
//
//                byte[] imageBytes = outputStream.toByteArray();

//                CarStaticClass.setBase64Image(Base64.getEncoder().encodeToString(imageBytes));
            }
        }

//        CarDAO carDb = new CarDAO();
//        
//        Car x = carDb.searchById(id);
//        
//            if (id == x.getId()) {
//                CarStaticClass.setId(id);
//                CarStaticClass.setOwner(x.getOwner());
//                CarStaticClass.setModel(x.getModel());
//                CarStaticClass.setLocation(x.getLocation());
//                CarStaticClass.setBrand(x.getBrand());
//                CarStaticClass.setKm(x.getKm());
//                CarStaticClass.setFuel(x.getFuel());
//                CarStaticClass.setCc(x.getCc());
//                CarStaticClass.setPrice(x.getPrice());
//                CarStaticClass.setCategories(x.getCategories());
//                CarStaticClass.setReleaseDate(x.getReleaseDate());
//                CarStaticClass.setColor(x.getColor());
//                CarStaticClass.setPhoto(x.getPhoto());
//
//                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//                byte[] buffer = new byte[4096];
//                int bytesRead = -1;
//
//                while ((bytesRead = CarStaticClass.getPhoto().read(buffer)) != -1) {
//                    outputStream.write(buffer, 0, bytesRead);
//                }
//
//                byte[] imageBytes = outputStream.toByteArray();
//
//                CarStaticClass.setBase64Image(Base64.getEncoder().encodeToString(imageBytes));
//        }
        response.sendRedirect("editPost.jsp");

    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
}
