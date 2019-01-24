<%-- 
    Document   : myPosts
    Created on : Jan 19, 2019, 5:48:44 PM
    Author     : manli
--%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.Cteam.Tables.Car"%>
<%@page import="java.util.List"%>
<%@page import="com.Cteam.UsefullBeans.CarResults"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Page Title</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
              crossorigin="anonymous">
        <link rel="stylesheet" href="CSS/index2.css">
    </head>

    <body class="main">

        <header id="userHeader"></header>
        <div class="">
            <div class="container divHeight fixPading">
                <% for (Car x : CarResults.getCarResults()) {
                %>
                <div class="row p-3">
                    <div class="bg-white rounded w-100 shadow">

                        <div class="d-flex flex-row p-2">
                            <div class="col-4">
                                <div class="ml-4 image">
                                    <img src="data:image/jpg;base64,<%= x.getBase64Image()%>" class="rounded float-left w-100 img-fluid image" alt="Photo">
                                </div>
                            </div>

                            <div class="col-6">
                                <div class="row">
                                    <div class="col-4 pr-2 d-flex justify-content-start">
                                        <u>Brand:</u>
                                    </div>
                                    <div class="col-4 d-flex justify-content-start">
                                        <%= x.getBrand()%>
                                    </div>

                                </div>
                                <div class="row">
                                    <div class="col-4 pr-2 d-flex justify-content-start">
                                        <u> Model:</u>
                                    </div>
                                    <div class="col-4 d-flex justify-content-start">
                                        <%= x.getModel()%>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-4 pt-2 pr-2 d-flex justify-content-start">
                                        <u>Release Date:</u>
                                    </div>
                                    <div class="col-4 pt-2 d-flex justify-content-start">
                                        <%= x.getReleaseDate()%>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-4 pt-2 pr-2 d-flex justify-content-start">
                                        <u>Category:</u>
                                    </div>
                                    <div class="col-4 pt-2 d-flex justify-content-start">
                                        <%= x.getCategories()%>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-4 pt-2 pr-2 d-flex justify-content-start">
                                        <u>Location:</u>
                                    </div>
                                    <div class="col-4 pt-2 d-flex justify-content-start">
                                        <h6><%= x.getLocation()%></h6>
                                    </div>
                                </div>
                            </div>

                            <div class="col-2 d-flex align-items-center">
                                <div class="row">

                                    <div class="col text-center pb-1">
                                        <button class="btn btn-block" id="edit" name="edit"><a href="<%=request.getContextPath()%>/editPosts?id=<%= x.getId()%>">Edit</a></button>
                                    </div>

                                    <div class="col text-center">

                                        <button class="btn btn-block" id="delete" name="delete"><a href="">Delete</a></button>

                                    </div>

                                </div>
                            </div>

                        </div>

                    </div>
                </div>
                <%}%>
            </div>
        </div>
        <footer id="footer"></footer>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
        crossorigin="anonymous"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
        <script src="JS/menuIndex.js"></script>

    </body>

</html>
