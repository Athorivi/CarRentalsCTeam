<%-- 
    Document   : editPost
    Created on : Jan 20, 2019, 12:21:51 PM
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
        <script src="JS/editPost.js"></script>
        
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
                            <%=CarStaticClass.getBrand()%>
                            <%=CarStaticClass.getModel()%>
                            <%=CarStaticClass.getReleaseDate()%>
                        </div>

                        <div class="row">
                            <img src="img/index-background.jpeg" class="rounded img-fluid" alt="Photo">
                        </div>

                        <div class="row">
                            <div class="col w-100">
                                <div>
                                    <form>
                                        <table class="table">
                                            <thead>
                                                <tr class="form-group">
                                                    <th colspan="2">Car Details</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <tr class="form-group">
                                                    <td class="">Brand:</td>
                                                    <td class="col-sm-6 align-items-end">
                                                        <input type="text" class="form-control" id="brand" value="<%=CarStaticClass.getBrand()%>"
                                                               placeholder="Brand">
                                                    </td>
                                                </tr>
                                                <tr class="form-group">
                                                    <td class="">Model:</td>
                                                    <td class="col-sm-6 align-items-end">
                                                        <input type="text" class="form-control" id="model" value="<%=CarStaticClass.getModel()%>"
                                                               placeholder="Model">
                                                    </td>
                                                </tr>
                                                <tr class="form-group">
                                                    <td class="">Price (per day):</td>
                                                    <td class="col-sm-6 align-items-end">
                                                        <input type="text" class="form-control" id="price" value="<%=CarStaticClass.getPrice()%>"
                                                               placeholder="Price">
                                                    </td>
                                                </tr>
                                                <tr class="form-group">
                                                    <td class="">Category:</td>
                                                    <td class="col-sm-6 align-items-end">
                                                        <input type="text" class="form-control" id="category" value="<%=CarStaticClass.getCategories()%>"
                                                               placeholder="Category">
                                                    </td>
                                                </tr>
                                                <tr class="form-group">
                                                    <td class="">Release Date:</td>
                                                    <td class="col-sm-6 align-items-end">
                                                        <input type="text" class="form-control" id="releaseDate" value="<%=CarStaticClass.getReleaseDate()%>"
                                                               placeholder="Release Date">
                                                    </td>
                                                </tr>
                                                <tr class="form-group">
                                                    <td class="">Km:</td>
                                                    <td class="col-sm-6 align-items-end">
                                                        <input type="text" class="form-control" id="km" value="<%=CarStaticClass.getKm()%>"
                                                               placeholder="Km">
                                                    </td>
                                                </tr>
                                                <tr class="form-group">
                                                    <td class="">Fuel:</td>
                                                    <td class="col-sm-6 align-items-end">
                                                        <input type="text" class="form-control" id="fuel" value="<%=CarStaticClass.getFuel()%>"
                                                               placeholder="Fuel">
                                                    </td>
                                                </tr>
                                                <tr class="form-group">
                                                    <td class="">CC:</td>
                                                    <td class="col-sm-6 align-items-end">
                                                        <input type="text" class="form-control" id="cc" value="<%=CarStaticClass.getCc()%>"
                                                               placeholder="CC">
                                                    </td>
                                                </tr>
                                                <tr class="form-group">
                                                    <td class="">Color:</td>
                                                    <td class="col-sm-6 align-items-end">
                                                        <input type="text" class="form-control" id="color" value="<%=CarStaticClass.getColor()%>"
                                                               placeholder="Color">
                                                    </td>
                                                </tr>
                                                <tr class="form-group">
                                                    <td class="">Location:</td>
                                                    <td class="col-sm-6 align-items-end">
                                                        <input type="text" class="form-control" id="location" value="<%=CarStaticClass.getLocation()%>"
                                                               placeholder="Location">
                                                    </td>
                                                </tr>
                                            </tbody>
                                        </table>
                                        <div classs="form-group">
                                            <div class="col pt-2">
                                                <div class="col d-flex justify-content-center">
                                                    <div class="pr-2">
                                                        <button id="saveInfo" name="saveInfo" class="btn btn-primary" disabled>Save</button>
                                                    </div>
                                                    <div class="">
                                                        <button id="back" name="back" class="btn btn-primary">Back</button>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </body>

</html>
