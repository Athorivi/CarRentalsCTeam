<%-- 
    Document   : adminIndex
    Created on : Jan 20, 2019, 4:57:58 PM
    Author     : manli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
              crossorigin="anonymous">
        <link rel="shortcut icon" type="image/ico" href="img/fav.ico"/>
        <link rel="stylesheet" href="CSS/index2.css">

    </head>

    <body class="main">

        <header id="adminHeader"></header>

        <div class="row w-100 pt-5 marg">
            <div class="col d-flex justify-content-start pt-4">
                onoma xrhsth
            </div>
            <div class="col d-flex justify-content-end marg pt-3">

                <button class="btn" id="back" name="back"><a href="">Back</a></button>

            </div>

        </div>

    </div>
    <div class="container divHeight">
        <div class="row p-2">
            <div class="bg-white rounded w-100">

                <div class="d-flex flex-row p-2">
                    <div class="col-4">
                        <div class="">
                            <img src="img/index-background.jpeg" class="rounded float-left w-100 img-fluid" alt="Photo">
                        </div>
                    </div>

                    <div class="col-6">
                        <div class="d-flex flex-row">
                            <div class="d-flex flex-column">
                                Brand
                            </div>
                            <div class="d-flex flex-column">
                                Model
                            </div>
                        </div>
                        <p class="d-flex flex-row">
                            Release Date
                        </p>
                        <p class="d-flex flex-row">
                            Category
                        </p>
                        <p class="d-flex flex-row">
                            Location
                        </p>
                    </div>

                    <div class="col-2 d-flex align-items-center">
                        <div class="row">

                            <div class="col text-center pb-1">
                                <input type="date" id="from" name="from" disabled>
                            </div>

                            <div class="col text-center">
                                <input type="date" id="to" name="to" disabled>
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
