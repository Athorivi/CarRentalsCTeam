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

        <div class="container divHeight fixPading">
            <div class="row">
                <div class="search p-2">
                    <input type="search" id="search" name="search" placeholder="Search by username" required>
                    <button class="btn" name="submit" id="submit"><a href="">Search</a></button>
                </div>
            </div>

            <div class="row">
                <div class="col rounded bg-white w-100 shadow">
                    <div>
                        <form>
                            <table class="table">
                                <thead>
                                    <tr class="form-group">
                                        <th class="col-1 border-0">ID</th>
                                        <th class="col-3 border-0">Username</th>
                                        <th class="col-2 border-0 d-flex justify-content-start">View Posts</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr class="form-group">
                                        <td>id</td>
                                        <td>Username</td>
                                        <td>
                                            <div class="row">
                                                <div class="col-2 d-flex justify-content-center">

                                                    <input type="submit" class="btn" name="view" id="view" value="View">

                                                </div>
                                            </div>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>

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
