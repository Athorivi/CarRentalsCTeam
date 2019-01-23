<%-- 
    Document   : rentNow
    Created on : Jan 18, 2019, 12:09:37 AM
    Author     : manli
--%>

<%@page import="com.Cteam.UsefullBeans.CarStaticClass"%>
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

        <header id="userHeader"></header>

        <div class="container fixPad">
            <div class="row">
                <div class="rounded bg-white col shadow">
                    <div class="p-3">
                        <div class="row">
                            <%=CarStaticClass.getBrand()%> <%=CarStaticClass.getModel()%> <%=CarStaticClass.getReleaseDate()%>
                        </div>

                        <div class="row w-100 h-25">
                            <img src="data:image/jpg;base64,<%= CarStaticClass.getBase64Image()%>" class="rounded img-fluid" alt="Photo">
                        </div>

                        <div class="row">
                            <div class="col-6">
                                <div>
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th colspan="2">Car Details</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>Brand:</td>
                                                <td><%=CarStaticClass.getBrand()%></td>
                                            </tr>
                                            <tr>
                                                <td>Model:</td>
                                                <td><%=CarStaticClass.getModel()%></td>
                                            </tr>
                                            <tr>
                                                <td>Price (per day):</td>
                                                <td><%=CarStaticClass.getPrice()%></td>
                                            </tr>
                                            <tr>
                                                <td>Category:</td>
                                                <td><%=CarStaticClass.getCategories()%></td>
                                            </tr>
                                            <tr>
                                                <td>Release Date:</td>
                                                <td><%=CarStaticClass.getReleaseDate()%></td>
                                            </tr>
                                            <tr>
                                                <td>Km:</td>
                                                <td><%=CarStaticClass.getKm()%></td>
                                            </tr>
                                            <tr>
                                                <td>Fuel:</td>
                                                <td><%=CarStaticClass.getFuel()%></td>
                                            </tr>
                                            <tr>
                                                <td>CC:</td>
                                                <td><%=CarStaticClass.getCc()%></td>
                                            </tr>
                                            <tr>
                                                <td>Color:</td>
                                                <td><%=CarStaticClass.getColor()%></td>
                                            </tr>
                                            <tr>
                                                <td>Location:</td>
                                                <td><%=CarStaticClass.getLocation()%></td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>

                            <div class="col-6 p-4">
                                <div class="row">
                                    <span class="font-weight-bold">Price (per day)</span>
                                    <hr>
                                </div>
                                <div class="row p-4">
                                    <div class="col-6">
                                        <input type="date" name="fromDate" id="fromDate" required>
                                    </div>
                                    <div class="col-4">
                                        <input type="date" name="toDate" id="toDate" required>
                                    </div>
                                </div>

                                <div class="row p-4">
                                    <div class="col-6">
                                        <span>Price (per day) x Days</span>
                                    </div>
                                    <div class="col-4">
                                        <span>Price</span>
                                    </div>
                                </div>

                                <div class="row p-4">
                                    <div class="col-6">
                                        <span>Supply of Services</span>
                                    </div>
                                    <div class="col-4">
                                        <span>10% of Price</span>
                                    </div>
                                </div>

                                <div class="row p-4">
                                    <div class="col-6">
                                        <h2>Total</h2>
                                    </div>
                                    <div class="col-4">
                                        <h3>Price</h3>
                                    </div>
                                </div>

                                <div class="row p-4">
                                    <div class="">
                                        <button class="btn" name="rent" id="rent"><a href="">Rent</a></button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
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
        <script src="JS/calendar.js"></script>
    </body>

</html>
