<%-- 
    Document   : userIndex
    Created on : Jan 19, 2019, 5:47:20 PM
    Author     : manli
--%>

<%@page import="java.io.OutputStream"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.Cteam.Tables.Car"%>
<%@page import="java.util.List"%>
<%@page import="com.Cteam.UsefullBeans.CarResults"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


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
        <div id="userHeader"></div>
        
        <div class="d-flex justify-content-center pading">
            <div class="d-flex justify-content-start bg-white rounded shadow w-25 p-3">
                <form method="POST" action="searchByLocation">
                    <div class="indexDiv d-flex flex-column justify-content-center">
                        <div class="form-group">
                            <h4 class="index-search-text">Rent the car that suits to your needs.</h4>
                        </div>
                        <div class="form-group">
                            <label for="location">Location</label>
                            <input type="text" class="form-control" id="location" name="location" placeholder="Search by location">
                        </div>
                        <div class="form-group">
                            <label for="from">From</label>
                            <input type="date" class="form-control" id="from" name="from">
                        </div>
                        <div class="form-group">
                            <label for="to">To</label>
                            <input type="date" class="form-control" id="to" name="to">
                        </div>
                        <div class="form-group text-center">
                            <button class="btn-sm w-100 rounded font-weight-bold">Search</button>
                        </div>
                    </div>
                </form>
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
        <script src="JS/edit.js"></script>
    </body>

</html>
