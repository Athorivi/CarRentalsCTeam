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
                                <td>id</td>
                                <td>Username</td>
                                <td>role</td>
                                <td>
                                    <div class="row">
                                        <div class="col-2">
                                            <button class="btn" name="update" id="update">Update</button>
                                        </div>

                                        <div class="col-2">
                                            <button class="btn" name="delete" id="delete">Delete</button>
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