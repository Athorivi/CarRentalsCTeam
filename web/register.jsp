<%-- 
    Document   : register
    Created on : Jan 12, 2019, 6:41:03 PM
    Author     : manli
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<div class="row d-flex justify-content-center p-5">
    <div class="col-6 p-0 bg-white rounded shadow">
        <form method="POST" action="register" enctype="multipart/form-data">
            <div class="loginRegisterDiv w-100 p-0">
                <ul class="nav nav-tabs w-100">
                    <li class="nav-item w-50">
                        <a class="this nav-link text-center navbarColor" href="" id="login">Login</a>
                    </li>
                    <li class="nav-item w-50">
                        <a class="this nav-link text-center active" href="" id="register">Register</a>
                    </li>
                </ul>

    </head>
    
    <header>
        <nav class="navbar navbar-expand-lg">
            <div class="collapse navbar-collapse col-md-10">
                <a class="navbar-brand " href="index.jsp">Logo</a>
            </div>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav"
                    aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse col-md-2" id="navbarNav">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item d-flex justify-content-end">
                        <a class="nav-item" href="#">About</a>
                    </li>
                </ul>
            </div>
        </nav>
    </header>
    
    <body>

        <div class="container divHeight">

            <div class="row d-flex justify-content-center p-5">
                <div class="col-6 p-0 bg-white rounded shadow">
                    <form method="POST" action="register">
                        <div class="loginRegisterDiv w-100 p-0">
                            <ul class="nav nav-tabs w-100">
                                <li class="nav-item w-50">
                                    <a class="this nav-link text-center navbarColor" href="index.jsp" id="login">Login</a>
                                </li>
                                <li class="nav-item w-50">
                                    <a class="this nav-link text-center active" href="register.jsp" id="register">Register</a>
                                </li>
                            </ul>

                            <div class="form-group row pt-3 pl-4 pr-4">
                                <div class="col-6">
                                    <label for="fName">First Name</label>
                                    <input type="text" class="form-control" id="fName" name="fName" placeholder="First Name" required>
                                </div>
                                <div class="col-6">
                                    <label for="lName">Last Name</label>
                                    <input type="text" class="form-control" id="lName" name="lName" placeholder="Last Name" required>
                                </div>
                            </div>

                            <div class="form-group row pl-4 pr-4">
                                <div class="col-6">
                                    <label for="username">Username</label>
                                    <input type="text" class="form-control" id="username" name="username" placeholder="Username" required>
                                </div>
                                <div class="col-6">
                                    <label for="password">Password</label>
                                    <input type="password" class="form-control" id="password" name="password" required>
                                </div>
                            </div>

                            <div class="form-group row pl-4 pr-4">
                                <div class="col-12">
                                    <label for="repeatPassword">Repeat Password</label>
                                    <input type="password" class="form-control" id="repeatPassword" name="repeatPassword" required>
                                </div>
                            </div>

                            <div class="form-group row pl-4 pr-4">
                                <div class="col-6">
                                    <label for="email">e-Mail</label>
                                    <input type="email" class="form-control" id="emaile" name="email" placeholder="e-Mail" required>
                                </div>
                                <div class="col-6">
                                    <label for="dob">Birthday</label>
                                    <input type="date" class="form-control" id="dob" name="dob" required>
                                </div>
                            </div>

                            <div class="form-group row pl-4 pr-4">
                                <div class="col-6">
                                    <label for="address">Address</label>
                                    <input type="text" class="form-control" id="address" name="address" placeholder="Address" required>
                                </div>
                                <div class="col-6">
                                    <label for="phone">Phone</label>
                                    <input type="text" class="form-control" id="phone" name="phone" required>
                                </div>
                            </div>

                            <div class="form-group row pl-4 pr-4">
                                <label for="photo">Choose a profile picture:</label>
                                <input type="file" id="photo" name="photo" required>
                            </div>
                            <div class="register-button pb-4 d-flex justify-content-center">
                                <input type="submit" class="btn rounded" id="registerButton" value="Register" />
                            </div>
                        </div>

                    </form>
                </div>
            </div>
        </div>


    </body>
    <footer>
        <div class="row p-4">
            <div class="col">
                <div class="d-flex justify-content-start">
                    <span><b><u>Contact Info</u></b></span>
                </div>

                <div class="d-flex justify-content-start">
                    <span>Location: Athens, Greece</span>
                </div>

                <div class="d-flex justify-content-start">
                    <span>e-Mail: info@cteam.gr</span>
                </div>

                <div class="d-flex justify-content-start">
                    <span>Phone Number: +30 210 9999999</span>
                    <div class="col-10 d-flex justify-content-end">
                        <span>All rights reserved by C_Team.</span>
                    </div>
                </div>

            </div>


        </div>

    </footer>


    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
    crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut"
    crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k"
    crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="JS/index.js"></script>

</html>
