<%-- 
    Document   : index.jsp
    Created on : 12 Ιαν 2019, 2:46:09 μμ
    Author     : User
--%>

<%@page import="DAO.RoleDAO"%>
<%@page import="Entities.Roles"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>Hello!</h1>
        <% 
            
        
        RoleDAO r = new RoleDAO();
        r.readRole();
        
        
        %>
        
        
        
        
    </body>
</html>
