package com.Cteam.Servlets;

import com.Cteam.DAO.CarDAO;
import com.Cteam.Tables.Car;
import com.Cteam.UsefullBeans.CarResults;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class searchByPrice extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String priceFrom = request.getParameter("priceFrom");
        String priceTo = request.getParameter("priceTo");
        CarDAO carDb = new CarDAO();
        ArrayList<Car> carList = carDb.searchByPrice(priceFrom, priceTo);
        CarResults cars = new CarResults();
        CarResults.setCarResults(carList);

        request.getRequestDispatcher("results").forward(request, response);

    }

}
