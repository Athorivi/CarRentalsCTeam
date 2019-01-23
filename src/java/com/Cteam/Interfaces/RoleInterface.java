package com.Cteam.Interfaces;

import com.Cteam.Tables.Roles;
import java.util.ArrayList;

public interface RoleInterface {

    public void createRole(Roles role);

    public ArrayList readRole();

    public void updateRole(Roles role);

    public void deleteRole(Integer id);

}
