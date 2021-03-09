package com.SpringBoot.SpringRestfulWeb.DynamicFilterQues9;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("dynamicfilter")
public class User {

    private int userId;
    private String userName;
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
