<%-- 
    Document   : login
    Created on : Jan 23, 2019, 9:22:45 PM
    Author     : manli
--%>

<div class="row d-flex justify-content-center pading">
    <div class="col-4 p-0 bg-white rounded shadow">
        <form method="POST" action="login">
            <div class="loginRegisterDiv w-100 p-0">
                <ul class="nav nav-tabs w-100">
                    <li class="nav-item w-50">
                        <a class="this nav-link text-center active" href="" id="login">Login</a>
                    </li>
                    <li class="nav-item w-50">
                        <a class="this nav-link text-center navbarColor" href="" id="register">Register</a>
                    </li>
                </ul>

                <div class="form-group pt-3 pl-4 pr-4">
                    <label for="username">Username</label>
                    <input type="text" class="form-control" id="username" name="username" placeholder="Username" required>
                </div>
                <div class="form-group pl-4 pr-4">
                    <label for="password">Password</label>
                    <input type="password" class="form-control" id="password" name="password" required>
                </div>
                <div class="login-button pb-4 d-flex justify-content-center">
                    <input type="submit" class="btn rounded" id="loginButton" value="Login" />
                </div>
            </div>
        </form>
    </div>
</div>
