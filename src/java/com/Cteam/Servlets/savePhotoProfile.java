package com.Cteam.Servlets;

import com.Cteam.DAO.UserDAO;
import com.Cteam.UsefullBeans.UserStaticClass;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@MultipartConfig(maxFileSize = 16177215)
public class savePhotoProfile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uname = null;
        HttpSession session = request.getSession(false);
        if (session != null) {
            uname = (String) session.getAttribute("username");
            System.out.println("Hello, " + uname + " Welcome to save Profile");
        }

        Part filePart = request.getPart("uploadPhoto");

        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());

            // obtains input stream of the upload file
            InputStream inputStream = filePart.getInputStream();

            UserDAO userDb = new UserDAO();
            int id = userDb.readUser(uname);

            //update photo where id
            userDb.updateUserPhoto(id, inputStream);
            UserStaticClass.setPhoto(inputStream);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            byte[] buffer = new byte[4096];
            int bytesRead = -1;

            while ((bytesRead = UserStaticClass.getPhoto().read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = outputStream.toByteArray();

            UserStaticClass.setBase64Image(Base64.getEncoder().encodeToString(imageBytes));

            request.getRequestDispatcher("userProfile").forward(request, response);

        }
    }

}
