package com.Cteam.Servlets;

import com.Cteam.DAO.CarDAO;
import com.Cteam.DAO.UserDAO;
import com.Cteam.DAO.UserRentCarDAO;
import com.Cteam.UsefullBeans.CarResults;
import com.Cteam.Tables.Car;
import com.Cteam.UsefullBeans.myRentsResults;
import com.Cteam.UsefullBeans.staticRentResults;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class viewMyRents extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String uname = null;
        HttpSession session = request.getSession(false);
        if (session != null) {
            uname = (String) session.getAttribute("username");
            System.out.println("Hello, " + uname + " Welcome to MyRents");
        }

        UserDAO userDb = new UserDAO();
        int id = userDb.readUser(uname);
        UserRentCarDAO urcDb = new UserRentCarDAO();
        ArrayList<myRentsResults> carList;
        carList = urcDb.readUserRentCar(id);
        staticRentResults rentResults = new staticRentResults();
        staticRentResults.setRentsResults(carList);

        request.getRequestDispatcher("myRents").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        String uname = null;
        HttpSession session = request.getSession(false);
        if (session != null) {
            uname = (String) session.getAttribute("username");
            System.out.println("Hello, " + uname + " Welcome to MyRents");
        }

        UserDAO userDb = new UserDAO();
        int id = userDb.readUser(uname);
        UserRentCarDAO urcDb = new UserRentCarDAO();
        ArrayList<myRentsResults> carList;
        carList = urcDb.readUserRentCar(id);
        staticRentResults rentResults = new staticRentResults();
        staticRentResults.setRentsResults(carList);

        request.getRequestDispatcher("myRents").forward(request, response);

    }
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
