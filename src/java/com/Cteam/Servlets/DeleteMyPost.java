package com.Cteam.Servlets;

import com.Cteam.DAO.CarDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteMyPost extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
 
        System.out.println("You are inside DoPost");
        String i = request.getParameter("id");
        int id = Integer.parseInt(i);
        CarDAO caradao = new CarDAO();
        caradao.deleteCar(id);
        request.getRequestDispatcher("viewMyPosts").forward(request, response);
        
    }

    
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
// 
//        PrintWriter out = response.getWriter();
// 
//        System.out.println("You are inside DoPost");
//        String i = request.getParameter("id");
//        int id = Integer.parseInt(i);
//        CarDAO caradao = new CarDAO();
//        caradao.deleteCar(id);
//        request.getRequestDispatcher("myPosts.jsp").forward(request, response);
//    }

}
