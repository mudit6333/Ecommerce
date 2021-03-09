package com.SpringBoot.SpringRestfulWeb.StaticFilterQues8;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {

    private int userId;
    private String userName;
    @JsonIgnore
    private String userPass;

    public User(int userId, String userName, String userPass) {
        this.userId = userId;
        this.userName = userName;
        this.userPass = userPass;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
}
