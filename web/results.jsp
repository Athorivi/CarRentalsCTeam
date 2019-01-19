<%-- 
    Document   : results
    Created on : Jan 17, 2019, 9:58:27 PM
    Author     : manli
--%>

<%@page import="java.io.OutputStream"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.Cteam.Tables.Car"%>
<%@page import="java.util.List"%>
<%@page import="com.Cteam.StaticBeans.CarResults"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Results</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
              crossorigin="anonymous" />
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>

    </head>
    <header>
        <nav class="navbar navbar-expand-lg">
            <div class="collapse navbar-collapse col-md-10">
                <a class="navbar-brand " href="#">Logo</a>
            </div>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav"
                    aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse col-md-2" id="navbarNav">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-item" href="#">About <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-item" href="JSP/login.jsp">Login / Register</a>
                    </li>
                </ul>
            </div>
        </nav>
    </header>
    <body class="bg-secondary">

        <div class="row">

            <div class="col-2">
                <div class="">
                    <h3>Filters</h3>
                </div>
                <div class="p-2">
                    <input type="text" id="category" name="category"/>
                </div>
                <div class="p-2">
                    <input type="text" id="brand" name="brand"/>
                </div>
                <div class="p-2">
                    <input type="text" id="model" name="model"/>
                </div>
                <div class="p-2">
                    <input type="range" id="price" name="price"/>
                </div>
            </div>

            <div class="col-10">
                <div class="container">
                    <% for (Car x : CarResults.getCarResults()) {
                    %>


                    <div class="row p-2">
                        <div class="bg-white rounded w-100">
                            <div class="d-flex flex-row p-2 ">
                                <div class="col-4">
                                    <div class="">




                                        <img src="" class="rounded float-left w-100 img-fluid" alt="Photo">
                                    </div>
                                </div>

                                <div class="col-6">
                                    <div class="d-flex flex-row">
                                        <div class="d-flex flex-column pr-1">
                                            Brand: <%= x.getBrand()%>
                                        </div>
                                        <div class="d-flex flex-column">
                                            <%= x.getModel()%>
                                        </div>
                                    </div>
                                    <p class="d-flex flex-row">
                                        Release Date:  <%= x.getReleaseDate()%>
                                    </p>
                                    <p class="d-flex flex-row">
                                        <%= x.getCategories()%>
                                    </p>
                                    <p class="d-flex flex-row">
                                        <%= x.getLocation()%>
                                    </p>
                                </div>

                                <div class="col-2">
                                    <div class="d-flex flex-row">
                                        <%= x.getPrice()%>
                                    </div>
                                    <div class="d-flex flex-row">
                                       <a href="<%=request.getContextPath()%>/rentNow?id=<%= x.getId()%>">Update</a>
<!--                                        <form action="../JSP/rentNow.jsp" method="GET">
                                            <input type="submit" name="rentNow" id="rentNow" value="Rent Now" />
                                        </form>-->
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>

                    <%}%>

                </div>
            </div>
        </div>  

    </body>
</html>
