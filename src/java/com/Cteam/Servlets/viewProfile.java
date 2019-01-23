package com.Cteam.Servlets;

import com.Cteam.DAO.UserDAO;
import com.Cteam.Tables.User;
import com.Cteam.UsefullBeans.UserStaticClass;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class viewProfile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String uname = null;
        HttpSession session = request.getSession(false);
        System.out.println(session);
        if (session != null) {
            uname = (String) session.getAttribute("username");
            System.out.println("Hello, " + uname + " Welcome to your Profile");
        }
        System.out.println(uname);

        UserDAO userDb = new UserDAO();
        User user = userDb.readUserByUsername(uname);
        UserStaticClass userStatic = new UserStaticClass();
        UserStaticClass.setId(user.getId());
        UserStaticClass.setUsername(user.getUsername());
        UserStaticClass.setPassword(user.getPassword());
        UserStaticClass.setFname(user.getFname());
        UserStaticClass.setLname(user.getLname());
        UserStaticClass.setDob(user.getDob());
        UserStaticClass.setEmail(user.getEmail());
        UserStaticClass.setAddress(user.getAddress());
        UserStaticClass.setPhone(user.getPhone());
        UserStaticClass.setPhoto(user.getPhoto());
        UserStaticClass.setBase64Image(user.getBase64Image());
        
        request.getRequestDispatcher("userProfile").forward(request, response);
        
    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//    }

}
