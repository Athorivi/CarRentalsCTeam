package com.Cteam.Servlets;

import com.Cteam.DAO.CarDAO;
import com.Cteam.DAO.RoleDAO;
import com.Cteam.DAO.UserRoleDAO;
import com.Cteam.Tables.Car;
import com.Cteam.Tables.UsersRoles;
import com.Cteam.UsefullBeans.CarResults;
import com.Cteam.UsefullBeans.UserRole;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class updateRole extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        UserRoleDAO role = new UserRoleDAO();
        UsersRoles userRole = new UsersRoles();
        userRole.setUserId(id);
        RoleDAO roleDb = new RoleDAO();
        int roleID = roleDb.readRoleByName(request.getParameter("roles"));
        userRole.setRoleId(roleID);

        role.updateUserRole(userRole);

        CarDAO carDb = new CarDAO();
        List<Car> carList;
        carList = carDb.searchByOwner(id);
        CarResults cr = new CarResults();
        CarResults.setCarResults((ArrayList<Car>) carList);

        request.getRequestDispatcher("userRoles.jsp").forward(request, response);

    }

}
