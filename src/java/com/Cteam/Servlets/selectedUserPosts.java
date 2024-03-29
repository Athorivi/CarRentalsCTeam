package com.Cteam.Servlets;

import com.Cteam.DAO.CarDAO;
import com.Cteam.Tables.Car;
import com.Cteam.UsefullBeans.CarResults;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class selectedUserPosts extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println(id);
        
        CarDAO carDb = new CarDAO();
        List<Car> carList;
        carList = carDb.searchByOwner(id);
        CarResults cr = new CarResults();
        CarResults.setCarResults((ArrayList<Car>) carList);
        
        
        request.getRequestDispatcher("selectedUserPosts.jsp").forward(request, response);
        
        
        

    }


}
