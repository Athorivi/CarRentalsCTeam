package com.Cteam.Tables;

import java.io.InputStream;
import java.sql.Date;
import javax.servlet.http.Part;

public class User {

    private int id;
    private String username;
    private String password;
    private String fname;
    private String lname;
    private String dob;
    private String email;
    private String address;
    private String phone;
    private InputStream photo;

    public User() {
    }

    public User(int id) {
        this.id = id;
    }

    public User(int id, String username, String password, String fname, String lname, String dob, String email, String address, String phone, InputStream photo) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.photo = photo;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public InputStream getPhoto() {
        return photo;
    }

    public void setPhoto(InputStream photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", username=" + username + ", password=" + password + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", email=" + email + ", address=" + address + ", phone=" + phone + ", photo=" + photo + '}';
    }

}
