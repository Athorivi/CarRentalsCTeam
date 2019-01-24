/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Cteam.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Cteam.DAO.CarDAO;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author herth
 */
public class DeleteMyPost extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        System.out.println("You are inside DoPost");
        String i = request.getParameter("id");
        int id = Integer.parseInt(i);
        CarDAO caradao = new CarDAO();
        caradao.deleteCar(id);
        RequestDispatcher rd = request.getRequestDispatcher("myPosts.jsp");
        rd.forward(request, response);

//        processRequest(request, response);
    }
}
