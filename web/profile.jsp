<%-- 
    Document   : profile
    Created on : Jan 19, 2019, 5:49:51 PM
    Author     : manli
--%>

<div>
    <div class="container p-3">
        <div class="bg-white rounded row pt-3 pb-3 w-100">
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
                        <div class="col mr-3 pt-3">
                            <div class="col-sm-10 d-flex justify-content-end">
                                <button id="saveInfo" name="saveInfo" class="btn w-50">Save</button>
                            </div>
                        </div>

                    </div>

                </form>
            </div>


            <div class="col">
                <div class="col">
                    <form action="">
                        <div class="row w-100">
                            <img src="" id="photo" name="photo" class="rounded mx-auto d-block img-thumbnail" alt="Photo">
                        </div>

                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text">Upload</span>
                            </div>
                            <div class="custom-file">
                                <input type="file" class="custom-file-input" id="uploadPhoto">
                                <label class="custom-file-label" for="uploadPhoto">Choose file</label>
                            </div>
                        </div>
                        <div class="form-group row">
                            <div class="col-sm-10 mx-auto d-block text-center">
                                <button id="savePhoto" name="savePhoto" class="btn w-50">Save</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
