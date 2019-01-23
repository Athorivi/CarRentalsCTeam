<%-- 
    Document   : register
    Created on : Jan 12, 2019, 6:41:03 PM
    Author     : manli
--%>

<div class="row d-flex justify-content-center p-5">
    <div class="col-6 p-0 bg-white rounded shadow">
        <form method="POST" action="register">
            <div class="loginRegisterDiv w-100 p-0">
                <ul class="nav nav-tabs w-100">
                    <li class="nav-item w-50">
                        <a class="this nav-link text-center navbarColor" href="" id="login">Login</a>
                    </li>
                    <li class="nav-item w-50">
                        <a class="this nav-link text-center active" href="" id="register">Register</a>
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
