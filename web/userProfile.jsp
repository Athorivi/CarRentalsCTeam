<%@page import="com.Cteam.UsefullBeans.UserStaticClass"%>
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
            <div class="bg-white rounded row pt-3 pb-3 w-100 shadow">
                <div class="col-6">
                    <form method="POST" action="saveProfile">
                        <div class="form-group row">
                            <label for="fname" class="col-sm-4 col-form-label">First Name</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="fname" id="fname" value="<%=UserStaticClass.getFname()%>" placeholder="First Name" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="lname" class="col-sm-4 col-form-label">Last Name</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="lname" id="lname" value="<%=UserStaticClass.getLname()%>" placeholder="Last Name" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="username" class="col-sm-4 col-form-label">Username</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="username" id="username" value="<%=UserStaticClass.getUsername()%>" disabled>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="password" class="col-sm-4 col-form-label">Password</label>
                            <div class="col-sm-6">
                                <input type="password" class="form-control" name="password" id="password" value="<%=UserStaticClass.getPassword()%>" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="repeatPassword" class="col-sm-4 col-form-label">Repeat Password</label>
                            <div class="col-sm-6">
                                <input type="password" class="form-control" name="fnarepeatPasswordme" id="repeatPassword" value="<%=UserStaticClass.getPassword()%>" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="dob" class="col-sm-4 col-form-label">Birthday</label>
                            <div class="col-sm-6">
                                <input type="date" class="form-control" name="dob" id="dob" value="<%=UserStaticClass.getDob()%>" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="email" class="col-sm-4 col-form-label">e-Mail</label>
                            <div class="col-sm-6">
                                <input type="email" class="form-control" name="email" id="email" value="<%=UserStaticClass.getEmail()%>" placeholder="e-Mail" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="address" class="col-sm-4 col-form-label">Address</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="address" id="address" value="<%=UserStaticClass.getAddress()%>" placeholder="Address" required>
                            </div>
                        </div>
                        <div class="form-group row">
                            <label for="phone" class="col-sm-4 col-form-label">Phone</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="phone" id="phone" value="<%=UserStaticClass.getPhone()%>" placeholder="Phone" required>
                            </div>

                            <div class="col-sm-10 d-flex justify-content-end pt-3">

                                <input type="submit" id="saveInfo" name="saveInfo" class="btn w-50" value="Save">

                            </div>


                        </div>

                    </form>
                </div>


                <div class="col">
                    <div class="col">
                        <form action="savePhotoProfile" method="POST" enctype="multipart/form-data">
                            <div class="row w-100">
                                <img src="data:image/jpg;base64,<%=UserStaticClass.getBase64Image()%>" id="photo" name="photo" class="rounded mx-auto d-block img-thumbnail" alt="Photo">
                            </div>

                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">Upload</span>
                                </div>
                                <div class="custom-file">
                                    <input type="file" class="custom-file-input" id="uploadPhoto" name="uploadPhoto">
                                    <label class="custom-file-label" for="uploadPhoto">Choose file</label>
                                </div>
                            </div>
                            <div class="form-group row">
                                <div class="col-sm-10 mx-auto d-block text-center">
                                    <input type="submit" id="savePhoto" name="savePhoto" class="btn w-50" value="Save">
                                </div>
                            </div>
                        </form>
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
