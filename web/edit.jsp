<%-- 
    Document   : edit
    Created on : Jan 19, 2019, 5:49:26 PM
    Author     : manli
--%>

<div>
    <div class="container p-2">
        <div class="row">
            <div class="bg-white rounded col">
                <div class="p-3">
                    <div class="row">
                        Brand Model Release Date
                    </div>

                    <div class="row">
                        <img src="../img/index-background.jpeg" class="rounded img-fluid" alt="Photo">
                    </div>

                    <div class="row">
                        <div class="justify-content-center">
                            <div>
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th colspan="2">Car Details</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>Brand:</td>
                                            <td><input type="text" name="brand" id="brand" placeholder="" /></td>
                                        </tr>
                                        <tr>
                                            <td>Model:</td>
                                            <td><input type="text" name="model" id="model" placeholder="" /></td>
                                        </tr>
                                        <tr>
                                            <td>Price (per day):</td>
                                            <td><input type="text" name="price" id="price" placeholder="" /></td>
                                        </tr>
                                        <tr>
                                            <td>Category:</td>
                                            <td><input type="text" name="category" id="category" placeholder="" /></td>
                                        </tr>
                                        <tr>
                                            <td>Release Date:</td>
                                            <td><input type="text" name="releaseDate" id="releaseDate" placeholder="" /></td>
                                        </tr>
                                        <tr>
                                            <td>Km:</td>
                                            <td><input type="text" name="km" id="km" placeholder="" /></td>
                                        </tr>
                                        <tr>
                                            <td>Fuel:</td>
                                            <td><input type="text" name="fuel" id="fuel" placeholder="" /></td>
                                        </tr>
                                        <tr>
                                            <td>CC:</td>
                                            <td><input type="text" name="cc" id="cc" placeholder="" /></td>
                                        </tr>
                                        <tr>
                                            <td>Color:</td>
                                            <td><input type="text" name="color" id="color" placeholder="" /></td>
                                        </tr>
                                        <tr>
                                            <td>Location:</td>
                                            <td><input type="text" name="location" id="location" placeholder="" /></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="justify-content-center">
                            <div class="col">
                                <form action="" mathod="POST">
                                    <input type="submit" name="save" id="save" value="Save" />
                                </form>
                            </div>
                            <div class="col">
                                <form action="">
                                    <input type="submit" name="back" id="back" value="Back" />
                                </form>
                            </div>
                        </div>

                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
