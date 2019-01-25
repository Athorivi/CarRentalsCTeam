package com.Cteam.Servlets;

import com.Cteam.DAO.UserDAO;
import com.Cteam.Tables.User;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig(maxFileSize = 16177215)
public class register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User user = new User();
        System.out.println(request.getParameter("username"));
        user.setUsername(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));
        user.setFname(request.getParameter("fName"));
        user.setLname(request.getParameter("lName"));
        user.setDob(request.getParameter("dob"));
        user.setEmail(request.getParameter("email"));
        user.setAddress(request.getParameter("address"));
        user.setPhone(request.getParameter("phone"));

        InputStream inputStream = null; // input stream of the upload file

        // obtains the upload file part in this multipart request
        Part filePart = request.getPart("uploadPhoto");

        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());

            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
            user.setPhoto(inputStream);
        }

        UserDAO userDb = new UserDAO();
        System.out.println(user.getUsername());
        userDb.createUser(user);
        
        
        request.getRequestDispatcher("index.jsp").forward(request, response);
        

    }

}
