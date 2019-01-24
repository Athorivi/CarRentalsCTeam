package com.Cteam.Servlets;

import com.Cteam.DAO.UserDAO;
import com.Cteam.Tables.User;
import com.Cteam.UsefullBeans.UserStaticClass;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class saveProfile extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String uname = null;
        HttpSession session = request.getSession(false);
        if (session != null) {
            uname = (String) session.getAttribute("username");
            System.out.println("Hello, " + uname + " Welcome to save Profile");
        }

        UserDAO userDb = new UserDAO();
        int id = userDb.readUser(uname);

        User user = new User();
        user.setId(id);
        user.setUsername(uname);
        user.setPassword(request.getParameter("password"));
        user.setFname(request.getParameter("fname"));
        user.setLname(request.getParameter("lname"));
        user.setDob(request.getParameter("dob"));
        user.setEmail(request.getParameter("email"));
        user.setAddress(request.getParameter("address"));
        user.setPhone(request.getParameter("phone"));
        user.setPhoto(UserStaticClass.getPhoto());

        userDb.updateUser(user);
        
        UserStaticClass.setId(user.getId());
        UserStaticClass.setUsername(user.getUsername());
        UserStaticClass.setPassword(user.getPassword());
        UserStaticClass.setFname(user.getFname());
        UserStaticClass.setLname(user.getLname());
        UserStaticClass.setDob(user.getDob());
        UserStaticClass.setEmail(user.getEmail());
        UserStaticClass.setAddress(user.getAddress());
        UserStaticClass.setPhone(user.getPhone());
        
        request.getRequestDispatcher("userProfile").forward(request, response);
    }

}
