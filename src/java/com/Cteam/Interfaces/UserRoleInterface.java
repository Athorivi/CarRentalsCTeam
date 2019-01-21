package com.Cteam.Interfaces;

import com.Cteam.Tables.UsersRoles;
import java.util.ArrayList;

public interface UserRoleInterface {

    public void createUserRole(UsersRoles usersRoles);

    public ArrayList readUserRole();

    public void updateUserRole(UsersRoles usersRoles);

    public void deleteUserRole(UsersRoles usersRoles);

}
