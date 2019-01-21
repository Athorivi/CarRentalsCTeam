package com.Cteam.Tables;

public class UsersRoles {

    private Integer id;
    private int userId;
    private int roleId;

    public UsersRoles() {
    }

    public UsersRoles(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "UsersRoles{" + "id=" + id + ", userId=" + userId + ", roleId=" + roleId + '}';
    }

}
