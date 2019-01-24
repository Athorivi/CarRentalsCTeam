package com.Cteam.Servlets;

import com.Cteam.DAO.UserRoleDAO;
import com.Cteam.UsefullBeans.UserRoleStatic;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class userRoles extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        UserRoleDAO userRole = new UserRoleDAO();
        UserRoleStatic.setUserRole(userRole.readUserRoleInner());

        request.getRequestDispatcher("userRoles.jsp").forward(request, response);

    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//    }

}
