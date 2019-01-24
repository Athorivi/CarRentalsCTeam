
package com.Cteam.Servlets;

import com.Cteam.DAO.UserRentCarDAO;
import com.Cteam.UsefullBeans.myRentsResults;
import com.Cteam.UsefullBeans.staticRentResults;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class deleteRent extends HttpServlet {

    

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        System.out.println("You are inside DoPostdeleteRent");
        String i = request.getParameter("id");
        int id = Integer.parseInt(i);
        UserRentCarDAO userRentCarDao = new UserRentCarDAO();
        userRentCarDao.deleteUserRentCar(id);
        ArrayList<myRentsResults> carList;
        carList = userRentCarDao.readUserRentCar(id);
        staticRentResults rentResults = new staticRentResults();
        staticRentResults.setRentsResults(carList);
        request.getRequestDispatcher("viewMyRents").forward(request, response);
 
    }
       
    
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//      
//    }

   

}
