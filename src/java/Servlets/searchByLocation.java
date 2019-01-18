package Servlets;

import com.Cteam.DAO.CarDAO;
import com.Cteam.Tables.Car;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class searchByLocation extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String location = request.getParameter("location");
        String from = request.getParameter("fromDate");
        String to = request.getParameter("toDate");
        CarDAO carDb = new CarDAO();
        List<Car> carList;
        if (location == null && from == null && to == null) {
            carList = carDb.readCar();
        } else {

            carList = carDb.searchByLocation(location, from, to);
        }

        try (PrintWriter out = response.getWriter()) {
            if (carList == null) {
                out.println("No records");

            } else {
                for (Car c : carList) {
                    out.println(c.toString());
                }
            }

        }

    }

}
