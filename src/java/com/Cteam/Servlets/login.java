/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Cteam.Servlets;

import com.Cteam.DAO.UserDAO;
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
public class login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UserDAO userDb = new UserDAO();
        String username = request.getParameter("username");

        String password = request.getParameter("password");
        boolean check = userDb.checkLogin(username, password);

        try (PrintWriter out = response.getWriter()) {
            out.println(check);
            if (check) {
                out.println("Logged in");
                if (username.equals("admin")) {

                    response.sendRedirect("adminMenu");
                } else {
                    response.sendRedirect("search");
                }
            } else {
                out.println("Failed");
            }
        }

    }

}
