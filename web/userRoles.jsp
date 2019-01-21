<%@page import="com.Cteam.StaticBeans.CarStaticClass"%>
<div class="container">
    <div class="search p-2">
        <input type="search" id="search" name="search" placeholder="Search by username">
        <button class="btn" name="submit" id="submit">Search</button>
    </div>
</div>
<div class="container">

    <div class="row">
        <div class="col rounded bg-white w-100">
            <div>
                <form>
                    <table class="table">
                        <thead>
                            <tr class="form-group">
                                <th class="border-0">ID</th>
                                <th class="border-0">Username</th>
                                <th class="border-0">Role</th>
                                <th class="border-0">Update / Delete</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr class="form-group">
                                <td class="col-sm-1 align-items-end">
                                    <input type="text" class="form-control" id="id" value="id"
                                           placeholder="id">
                                </td>
                                <td class="col-sm-3 align-items-end">
                                    <input type="text" class="form-control" id="username" value="username"
                                           placeholder="username">
                                </td>
                                <td class="col-sm-2 align-items-end">
                                    <input type="text" class="form-control" id="roles" value="role"
                                           placeholder="roles">
                                </td>
                                <td>
                                    <div class="row">
                                        <div class="col-2">
                                            <a href="">
                                                <button class="btn" name="update" id="update" disabled>Update</button>
                                            </a>
                                        </div>

                                        <div class="col-2">
                                            <a href="">
                                                <button class="btn" name="delete" id="delete">Delete</button>
                                            </a>
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
<script src="JS/edit.js"></script>