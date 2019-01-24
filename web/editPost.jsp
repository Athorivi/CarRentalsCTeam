<%-- 
    Document   : editPost
    Created on : Jan 20, 2019, 12:21:51 PM
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

        <div class="container divHeight fixPad">
            <div class="row">
                <div class="rounded bg-white col">
                    <div class="p-3">
                        <div class="row">
                            <%=CarStaticClass.getBrand()%>
                            <%=CarStaticClass.getModel()%>
                            <%=CarStaticClass.getReleaseDate()%>
                        </div>

                        <div class="row">
                            <img src="data:image/jpg;base64,<%= CarStaticClass.getBase64Image()%>" class="rounded img-fluid" alt="Photo">
                        </div>

                        <div class="row">
                            <div class="col w-100">
                                <div>
                                    <form action="saveInfo" method="post">
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
                                              
                                                        <input type="submit" id="saveInfo" name="saveInfo" class="btn" value="Save">

                                                    </div>
                                                    <div class="">

                                                        <button id="back" name="back" class="btn"><a href="myPosts.jsp">Back</a></button>

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
