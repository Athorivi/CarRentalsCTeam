<%-- 
    Document   : login
    Created on : Jan 12, 2019, 6:39:06 PM
    Author     : manli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Welcome</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
        crossorigin="anonymous" />
    <link rel="stylesheet" type="text/css" media="screen" href="../CSS/login.css" />
</head>
<body>

    <section class="d-flex justify-content-center">
<!--        <form method="POST" action="login">
            <div class="loginRegisterDiv d-flex flex-column">
                <div class="d-flex flex-row">
                    <div class="col-md-7">
                        <a href="login.jsp" class="navbar-brand">Login</a>
                    </div>
                    <div class="col-md-2">
                        <a href="register.jsp" class="navbar-brand">Register</a>
                    </div>
                </div>
                <div class="p-2">
                    <div>
                        <span class="username">Username</span>
                    </div>
                    <div>
                        <input type="text" id="username" name="username">
                    </div>
                </div>
                <div class="p-2">
                    <div>
                        <span class="password">Password</span>
                    </div>
                    <div>
                        <input type="text" id="password" name="password">
                    </div>
                </div>
                <div class="login-button p-2 d-flex justify-content-center">
                    <input type="submit" id="loginButton" value="Login" />
                </div>
            </div>
        </form>-->


             <form method="POST" action="searchByLocation">
                            <div class="indexDiv d-flex flex-column justify-content-center">
                                <div class="index-search p-2">
                                    <span class="index-search-text">Rent the car that suits to your needs.</span>
                                </div>
                                <div class="index-search p-2">
                                    <div id="locationText">
                                        <span>Location</span>
                                    </div>
                                    <div class="location-text">
                                        <input type="text" id="location" name="location" placeholder="City..">
                                    </div>
                                </div>
                                <div class="index-search p-2">
                                    <div id="from">
                                        <span>From</span>
                                    </div>
                                    <div class="date-text">
                                        <input type="date" id="fromDate" name="fromDate">
                                    </div>
                                </div>
                                <div class="index-search p-2">
                                    <div id="to">
                                        <span>To</span>
                                    </div>
                                    <div class="date-text">
                                        <input type="date" id="toDate" name="toDate">
                                    </div>
                                </div>
                                <div class="index-search p-2">
                                    <a href="#">More Options</a>
                                </div>
                                <div class="index-search-button p-2">
                                    <button id="searchButton">Search</button>
                                </div>
            
                            </div>
                        </form>
    </section>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
    crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"
    crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
    crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.3/angular.min.js"></script>
</body>
</html>
