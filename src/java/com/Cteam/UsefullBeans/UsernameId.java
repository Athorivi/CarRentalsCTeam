package com.Cteam.UsefullBeans;

public class UsernameId {

    private int id;
    private String username;

    public UsernameId() {
    }

    public UsernameId(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UsernameId{" + "id=" + id + ", username=" + username + '}';
    }

}
