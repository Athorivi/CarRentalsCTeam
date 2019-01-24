<%-- 
    Document   : newPost
    Created on : Jan 22, 2019, 8:57:26 PM
    Author     : manli
--%>

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
            <div class="container fixPading">
                <div class="row">
                    <div class="rounded bg-white col ">
                        <div class="p-3">
                            <div class="row">
                                <div class="col w-100">
                                    <div>
                                        <form action="postCar" method="POST" enctype="multipart/form-data">
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
                                                            <input type="text" class="form-control" id="brand" name="brand" required>

                                                        </td>
                                                    </tr>
                                                    <tr class="form-group">
                                                        <td class="">Model:</td>
                                                        <td class="col-sm-6 align-items-end">
                                                            <input type="text" class="form-control" id="model" name="model" required>
                                                        </td>
                                                    </tr>
                                                    <tr class="form-group">
                                                        <td class="">Price (per day):</td>
                                                        <td class="col-sm-6 align-items-end">
                                                            <input type="text" class="form-control" id="price" name="price" required>
                                                    </tr>
                                                    <tr class="form-group">
                                                        <td class="">Category:</td>
                                                        <td class="col-sm-6 align-items-end">
                                                            <input type="text" class="form-control" id="category" name="category" required>
                                                        </td>
                                                    </tr>
                                                    <tr class="form-group">
                                                        <td class="">Release Date:</td>
                                                        <td class="col-sm-6 align-items-end">
                                                            <input type="date" class="form-control" id="releaseDate" name="releaseDate" required>
                                                        </td>
                                                    </tr>
                                                    <tr class="form-group">
                                                        <td class="">Km:</td>
                                                        <td class="col-sm-6 align-items-end">
                                                            <input type="number" class="form-control" id="km" name="km" min="0" required>
                                                        </td>
                                                    </tr>
                                                    <tr class="form-group">
                                                        <td class="">Fuel:</td>
                                                        <td class="col-sm-6 align-items-end">
                                                            <input type="text" class="form-control" id="fuel" name="fuel" required>
                                                    </tr>
                                                    <tr class="form-group">
                                                        <td class="">CC:</td>
                                                        <td class="col-sm-6 align-items-end">
                                                            <input type="number" class="form-control" id="cc" min="0" name="cc" required>
                                                        </td>
                                                    </tr>
                                                    <tr class="form-group">
                                                        <td class="">Color:</td>
                                                        <td class="col-sm-6 align-items-end">
                                                            <input type="text" class="form-control" id="color" name="color" required>
                                                        </td>
                                                    </tr>
                                                    <tr class="form-group">
                                                        <td class="">Location:</td>
                                                        <td class="col-sm-6 align-items-end">
                                                            <input type="text" class="form-control" id="location" name="location" required>
                                                        </td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                            <div class="input-group mb-3 pl-3">
                                                <div class="input-group-prepend">
                                                    <span class="input-group-text">Upload</span>
                                                </div>
                                                <div class="custom-file">
                                                    <input type="file" id="uploadPhoto" name="uploadPhoto" required>

                                                </div>
                                            </div>
                                            <div classs="form-group">
                                                <div class="col pt-2">
                                                    <div class="col d-flex justify-content-center">
                                                        <input type="submit" id="saveInfo" name="saveInfo" class="btn" value="Save">
                                                        <!--                                                    <div class="pr-2">
                                                                                                                <button type="submit" id="saveInfo" name="saveInfo" class="btn" >Save</button>
                                                                                                            </div>-->

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
        
    </body>

</html>
