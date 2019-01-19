/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Cteam.Servlets;

import com.Cteam.StaticBeans.CarResults;
import com.Cteam.StaticBeans.CarStaticClass;
import com.Cteam.Tables.Car;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class rentNow extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet rentNow</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet rentNow at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        int id = Integer.valueOf(request.getParameter("id"));
        System.out.println("the id is");
        System.out.println(id);
        CarStaticClass car = new CarStaticClass();
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
            }
        }
        response.sendRedirect("rentNow.jsp");

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//        processRequest(request, response);
    }

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
