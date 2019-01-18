<%-- 
    Document   : rentNow
    Created on : Jan 18, 2019, 12:09:37 AM
    Author     : manli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Brand Model...</title>
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
        <div class="container p-2">
            <div class="row">
                <div class="rounded bg-white col">
                    <div class="p-3">
                        <div class="row">
                            Brand Model Release Date
                        </div>

                        <div class="row">
                            <img src="../img/index-background.jpeg" class="rounded img-fluid" alt="Photo">
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
                                                <td>Example</td>
                                            </tr>
                                            <tr>
                                                <td>Model:</td>
                                                <td>Example</td>
                                            </tr>
                                            <tr>
                                                <td>Price (per day):</td>
                                                <td>Example</td>
                                            </tr>
                                            <tr>
                                                <td>Category:</td>
                                                <td>Example</td>
                                            </tr>
                                            <tr>
                                                <td>Release Date:</td>
                                                <td>Example</td>
                                            </tr>
                                            <tr>
                                                <td>Km:</td>
                                                <td>Example</td>
                                            </tr>
                                            <tr>
                                                <td>Fuel:</td>
                                                <td>Example</td>
                                            </tr>
                                            <tr>
                                                <td>CC:</td>
                                                <td>Example</td>
                                            </tr>
                                            <tr>
                                                <td>Color:</td>
                                                <td>Example</td>
                                            </tr>
                                            <tr>
                                                <td>Location:</td>
                                                <td>Example</td>
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
                                        <input type="date" name="fromDate" id="fromDate" />
                                    </div>
                                    <div class="col-4">
                                        <input type="date" name="toDate" id="toDate" />
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
                                    <div>
                                        <form action="../JSP/receipt.jsp" method="POST">
                                            <div>
                                                <input type="submit" name="rent" id="rent" value="Rent"/>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
