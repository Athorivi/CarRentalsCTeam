<%-- 
    Document   : viewPost
    Created on : Jan 20, 2019, 2:05:28 PM
    Author     : manli
--%>

<%@page import="com.Cteam.StaticBeans.CarStaticClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            <%=CarStaticClass.getBrand()%>
            <%= CarStaticClass.getModel()%>
        </title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
              crossorigin="anonymous" />

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
        crossorigin="anonymous"></script>

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

    <body class="bg-secondary yui3-skin-sam">
        <div class="container p-2">
            <div class="row">
                <div class="rounded bg-white col">
                    <div class="p-3">
                        <div class="row">
                            <%=CarStaticClass.getBrand()%>
                            <%=CarStaticClass.getModel()%>
                            <%=CarStaticClass.getReleaseDate()%>
                        </div>

                        <div class="row">
                            <img src="img/index-background.jpeg" class="rounded img-fluid" alt="Photo">
                        </div>

                        <div class="row w-100">
                            <div class="col-6">
                                <input type="date" id="from" name="from" class="w-100" disabled>
                            </div>

                            <div class="col-6">
                                <input type="date" id="to" name="to" class="w-100" disabled>
                            </div>
                        </div>

                        <div class="row w-100 pt-3">
                            <div class="col d-flex justify-content-center">
                                <div class="">
                                    <button id="back" name="back" class="btn btn-primary">Back</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

    </body>

</html>