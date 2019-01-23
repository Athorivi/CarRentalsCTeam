<%-- 
    Document   : profile
    Created on : Jan 19, 2019, 5:49:51 PM
    Author     : manli
--%>
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

        <div id="userHeader"></div>

        <div class="container fixPad">
            <div class="bg-white rounded row pt-3 pb-3 w-100 shadow">
                <div class="col-6">
                    <form>
                        <div class="form-group row">
                            <label for="fname" class="col-sm-4 col-form-label">First Name</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="fname" id="fname" value="" placeholder="First Name">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="lname" class="col-sm-4 col-form-label">Last Name</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="lname" id="lname" value="" placeholder="Last Name">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="username" class="col-sm-4 col-form-label">Username</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="username" id="username" value="" disabled>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="password" class="col-sm-4 col-form-label">Password</label>
                            <div class="col-sm-6">
                                <input type="password" class="form-control" name="password" id="password">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="repeatPassword" class="col-sm-4 col-form-label">Repeat Password</label>
                            <div class="col-sm-6">
                                <input type="password" class="form-control" name="fnarepeatPasswordme" id="repeatPassword">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="dob" class="col-sm-4 col-form-label">Birthday</label>
                            <div class="col-sm-6">
                                <input type="date" class="form-control" name="dob" id="dob" value="">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="email" class="col-sm-4 col-form-label">e-Mail</label>
                            <div class="col-sm-6">
                                <input type="email" class="form-control" name="email" id="email" value="" placeholder="e-Mail">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="address" class="col-sm-4 col-form-label">Address</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="address" id="address" value="" placeholder="Address">
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="phone" class="col-sm-4 col-form-label">Phone</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="phone" id="phone" value="" placeholder="Phone">
                            </div>

                            <div class="col-sm-10 d-flex justify-content-end pt-3">

                                <button id="saveInfo" name="saveInfo" class="btn w-50"><a href="">Save</a></button>

                            </div>


                        </div>

                    </form>
                </div>


                <div class="col">
                    <div class="col">
                        <form action="">
                            <div class="form-group row">
                                <label for="photo">Choose a profile picture:</label>
                                <input type="file" id="photo" name="photo" required>
                            </div>
                            <div class="form-group row">
                                <div class="col-sm-10 mx-auto d-block text-center">
                                    <button id="savePhoto" name="savePhoto" class="btn w-50"><a href="">Save</a></button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <div id="footer"></div>

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
