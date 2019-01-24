<%-- 
    Document   : receipt
    Created on : Jan 20, 2019, 2:43:34 PM
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
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
              crossorigin="anonymous">
        <link rel="shortcut icon" type="image/ico" href="img/fav.ico"/>
        <link rel="stylesheet" href="CSS/index2.css">

    </head>

    <body class="main">

        <header id="userHeader"></header>
        <div class="divHeight">
            <div class="container fixPading p-3">
                <div class="row text-center">
                    <div class="col w-100">
                        <h5>
                            Your Reservation for,
                            <%=CarStaticClass.getBrand()%>
                            <%=CarStaticClass.getModel()%>
                            <%=CarStaticClass.getReleaseDate()%> has successfully stored!
                        </h5>
                    </div>
                </div>
            </div>

            <div class="container p-2">
                <div class="row">
                    <div class="rounded bg-white col shadow">
                        <div class="">
                            <div class="p-3">

                                <div class="row d-flex justify-content-center p-4">
                                    <div class="col-3 d-flex justify-content-start">
                                        <span>Price (per day) x Days</span>
                                    </div>
                                    <div class="col-3 d-flex justify-content-end">
                                        <span>Price</span>
                                    </div>
                                </div>

                                <div class="row d-flex justify-content-center p-4">
                                    <div class="col-3 d-flex justify-content-start">
                                        <input type="date" name="fromDate" id="fromDate" class="w-100" disabled />
                                    </div>
                                    <div class="col-3 d-flex justify-content-end">
                                        <input type="date" name="toDate" id="toDate" class="w-100" disabled />
                                    </div>
                                </div>

                                <div class="row d-flex justify-content-center p-4">
                                    <div class="col-3 d-flex justify-content-start">
                                        <span>Supply of Services</span>
                                    </div>
                                    <div class="col-3 d-flex justify-content-end">
                                        <span>10% of Price</span>
                                    </div>
                                </div>

                                <div class="row d-flex justify-content-center p-4">
                                    <div class="col-3 d-flex justify-content-start">
                                        <h2>Total</h2>
                                    </div>
                                    <div class="col-3 d-flex justify-content-end">
                                        <h3>Price</h3>
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

    </body>

</html>
