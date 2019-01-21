<%-- 
    Document   : adminIndex
    Created on : Jan 20, 2019, 4:57:58 PM
    Author     : manli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
              crossorigin="anonymous">
        <link rel="stylesheet" href="CSS/index2.css">

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
        crossorigin="anonymous"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
        <script src="JS/menuIndex.js"></script>

    </head>
    <header>

        <nav class="navbar navbar-expand-lg navbar-light shadow">
            <a class="navbar-brand" href="#" class="header">Logo</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav"
                    aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
                <ul class="navbar-nav" id="nav">
                    <li class="nav-item">
                        <a class="nav-link header" href="userRoles">User's Roles <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link header" href="userPosts">User's Posts</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link header" href="userRents">User's Rents</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link header" href="profile">Profile</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link header" href="logout">Logout</a>
                    </li>
                </ul>
            </div>
        </nav>

    </header>

    <body class="main">
        <div class="container">
            <div class="row pt-2 w-100 shadow">
                <div class="col d-flex justify-content-start">
                    onoma xrhsth
                </div>
                <div class="col d-flex justify-content-end">
                    <a href="userPosts">
                        <button class="btn" id="back" name="back">Back</button>
                    </a>

                </div>

            </div>

        </div>
        <div class="container">
            <div class="row p-2">
                <div class="bg-white rounded w-100">

                    <div class="d-flex flex-row p-2">
                        <div class="col-4">
                            <div class="row">
                                <img src="" class="rounded float-left w-100 img-fluid" alt="Photo">
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

                                <div class="col d-flex justify-content-center ">
                                    <a href="">
                                        <button class="btn" id="delete" name="delete">Delete</button>
                                    </a>
                                </div>

                            </div>
                        </div>

                    </div>

                </div>
            </div>
        </div>

    </body>

</html>


