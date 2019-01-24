package com.Cteam.Servlets;
 
import com.Cteam.DAO.CarDAO;
import com.Cteam.Tables.Car;
import com.Cteam.UsefullBeans.CarStaticClass;
import java.io.IOException;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
/**
 *
 * @author herth
 */
public class saveInfo extends HttpServlet {
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        CarDAO cardb = new CarDAO();
        
 
        Car car = new Car();
        HttpSession session = request.getSession();
        int id = (Integer) session.getAttribute("id");
        System.out.println(id);
        car.setId(id);
        car.setOwner(cardb.searchById(id).getOwner());
        car.setBrand(request.getParameter("brand"));
        car.setModel(request.getParameter("model"));
        car.setPrice(Double.valueOf(request.getParameter("price")));
        car.setCategories(request.getParameter("category"));
        car.setReleaseDate(Date.valueOf(request.getParameter("releaseDate")));
        car.setKm(Integer.valueOf(request.getParameter("km")));
        car.setFuel(request.getParameter("fuel"));
        car.setCc(Integer.valueOf(request.getParameter("cc")));
        car.setColor(request.getParameter("color"));
        car.setLocation(request.getParameter("location"));
        car.setPhoto(cardb.searchById(id).getPhoto());
        car.setBase64Image(cardb.searchById(id).getBase64Image());
        System.out.println("saveInfo");
        CarDAO carDao = new CarDAO();
        carDao.updateCar(car);
 
        CarStaticClass.setBrand(car.getBrand());
        CarStaticClass.setModel(car.getModel());
        CarStaticClass.setPrice(car.getPrice());
        CarStaticClass.setCategories(car.getCategories());
        CarStaticClass.setReleaseDate(car.getReleaseDate());
        CarStaticClass.setKm(car.getKm());
        CarStaticClass.setFuel(car.getFuel());
        CarStaticClass.setCc(car.getCc());
        CarStaticClass.setColor(car.getColor());
        CarStaticClass.setLocation(car.getLocation());
 
        request.getRequestDispatcher("viewMyPosts").forward(request, response);
 
    }
 
}