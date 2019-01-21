<%-- 
    Document   : register
    Created on : Jan 12, 2019, 6:41:03 PM
    Author     : manli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Page Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
          crossorigin="anonymous" />
    <link rel="stylesheet" type="text/css" media="screen" href="../CSS/register.css" />
</head>
<body>
    <section class="">
        <section class="d-flex justify-content-center">
            <form method="POST" action="register" enctype="multipart/form-data">
                <div class="loginRegisterDiv d-flex flex-column">
                    <div class="d-flex flex-row justify-content-center">
                        <div class="d-flex flex-column col-md-6">
                            <a class="navbar-brand " href="login.jsp">Login</a>
                        </div>
                        <div class="d-flex flex-column col-md-3">
                            <a class="navbar-brand " href="register.jsp">Register</a>
                        </div>
                    </div>
                    <div class="p-1 d-flex flex-row">
                        <div class="flex-column">
                            <div class="p-1">
                                <span>First Name</span>
                            </div>
                            <div class="p-1">
                                <input type="text" name="fName" id="fName">
                            </div>
                        </div>
                        <div class="flex-column">
                            <div class="p-1">
                                <span>Last Name</span>
                            </div>
                            <div class="p-1">
                                <input type="text" name="lName" id="lName">
                            </div>
                        </div>
                    </div>
                    <div class="p-1 d-flex flex-row">
                        <div class="flex-column">
                            <div class="p-1">
                                <span>Username</span>
                            </div>
                            <div class="p-1">
                                <input type="text" name="username" id="username">
                            </div>
                        </div>
                        <div class="flex-column">
                            <div class="p-1">
                                <span>Password</span>
                            </div>
                            <div class="p-1">
                                <input type="text" name="password" id="password">
                            </div>
                        </div>
                    </div>
                    <div class="p-1 d-flex flex-row">
                        <div class="p-1 d-flex flex-column">
                            <div class="p-1">
                                <span>Repeat Password</span>
                            </div>
                            <div class="repeatPassword p-1">
                                <input type="text" id="repeatPassword" name="repeatPassword">
                            </div>
                        </div>
                    </div>
                    <div class="p-1 d-flex flex-row">
                        <div class="flex-column">
                            <div class="p-1">
                                <span>e-Mail</span>
                            </div>
                            <div class="p-1">
                                <input type="text" name="email" id="email">
                            </div>
                        </div>
                        <div class="flex-column">
                            <div class="p-1">
                                <span>Birthday</span>
                            </div>
                            <div class="p-1">
                                <input type="date" name="birthday" id="birthday">
                            </div>
                        </div>
                    </div>
                    <div class="p-1 d-flex flex-row">
                        <div class="flex-column">
                            <div class="p-1">
                                <span>Address</span>
                            </div>
                            <div class="p-1">
                                <input type="text" name="address" id="address">
                            </div>
                        </div>
                        <div class="flex-column">
                            <div class="p-1">
                                <span>Phone</span>
                            </div>
                            <div class="p-1">
                                <input type="text" name="phone" id="phone">
                            </div>
                        </div>
                    </div>
                    <div class="p-1 d-flex flex-row">
                        <div class="p-1 d-flex flex-column">
                            <div class="p-1">
                                <span>Upload Photo</span>
                            </div>
                            <div class="p-1">
                                <input type="file" id="uploadPhoto" name="uploadPhoto" value="Upload Photo">
                            </div>
                        </div>
                    </div>
                    <div class="register-button p-1 d-flex justify-content-center">
                        <input type="submit" id="registerButton" value="Register" />
                    </div>
                </div>
            </form>
        </section>
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
