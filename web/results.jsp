<%@page import="com.Cteam.UsefullBeans.CategoriesStaticClass"%>
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
        <link rel="shortcut icon" type="image/ico" href="img/fav.ico"/>
        <link rel="stylesheet" href="CSS/index2.css">
    </head>

    <body class="main">

        <header id="userHeader"></header>

        <div class="divHeight">

            <div class="row fixPading">

                <div class="col-2 ml-3 mt-3 filters fixed-top">
                    <div class="float-left bg-white rounded w-100 p-3">
                        <form method="POST" action="searchByCategory">
                            <div class="indexDiv d-flex flex-column justify-content-center">
                                <div class="form-group text-center">
                                    <h4 class="index-search-text">Filters</h4>
                                </div>
                                <div class="form-group">
                                    <label for="category">Category</label>
                                    <select class="form-control" id="category" name="category" required>
                                        <% for (String x : CategoriesStaticClass.getCategories()) {%>
                                        <option value="<%=x%>"><%=x%></option>
                                        <%}%>
                                    </select>
                                </div>
                                <div class="text-center">
                                    <input type="submit" class="btn-sm rounded w-50" id="category" name="category" value="Search">
                                </div>
                            </div>
                        </form>

                        <form method="POST" action="searchByCc">
                            <div class="indexDiv d-flex flex-column justify-content-center pt-4">
                                <div class="form-group row">
                                    <div class="col-6 text-center">
                                        <label for="from">CC (from): </label>
                                        <input type="number" class="form-control" id="from" name="from" min="500" max="5000" step="500" value="500" required>
                                    </div>
                                    <div class="col-6 text-center">
                                        <label for="to">CC (to):</label>
                                        <input type="number" class="form-control" id="to" name="to" min="500" max="5000" step="500" required>
                                    </div>
                                </div>
                                <div class="text-center">
                                    <input type="submit" class="btn-sm rounded w-50" id="cc" name="cc" value="Search">
                                </div>
                            </div>
                        </form>

                        <form action="searchByPrice" method="POST">
                            <div class="indexDiv d-flex flex-column justify-content-center pt-4">
                                <div class="form-group row">
                                    <div class="col-6 text-center">
                                        <label for="priceFrom">Price (from): </label>
                                        <input type="number" class="form-control" id="priceFrom" name="priceFrom" min="0" step="5" value="0" required>
                                    </div>
                                    <div class="col-6 text-center">
                                        <label for="priceTo">Price (to):</label>
                                        <input type="number" class="form-control" id="priceTo" name="priceTo" min="0" step="5" value="" required>
                                    </div>
                                </div>
                                <div class="text-center">
                                    <input type="submit" class="btn-sm rounded w-50" id="price" name="price" value="Search">
                                </div>
                            </div>
                        </form>
                    </div>
                </div>

                <div class="col-10 pt-3 pb-5">
                    <div class="container filtersVoid">
                        <% for (Car x : CarResults.getCarResults()) {%>


                        <div class="row p-2">
                            <div class="bg-white rounded shadow w-100">
                                <div class="d-flex flex-row p-2">
                                    <div class="col-4">
                                        <div class="w-100 image pt-2">
                                            <img src="data:image/jpg;base64,<%= x.getBase64Image()%>" class="rounded float-left w-100 image" alt="Photo">
                                        </div>
                                    </div>

                                    <div class="col-5">
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

                                    <div class="col-3">
                                        <div class="d-flex flex-row justify-content-center pt-5">

                                            <h6><%=x.getPrice()%> € / Day</h6>
                                        </div>
                                        <div class="d-flex flex-row">
                                            <button class="btn-sm w-100 rounded"><a href="<%=request.getContextPath()%>/rentNow?id=<%= x.getId()%>">View More</a></button>
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

            <footer id="footer" class="footerBot"></footer>

        </div>


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