package com.oy.kevin.Model;

import java.util.List;

/**
 * Created by Kevin on 2020/10/1
 */
public class Enterprise {

    private String usershow;
    private String userinfo;

    @Override
    public String toString() {
        return "Enterprise{" +
                "usershow='" + usershow + '\'' +
                ", userinfo='" + userinfo + '\'' +
                '}';
    }

    public String getUsershow() {
        return usershow;
    }

    public void setUsershow(String usershow) {
        this.usershow = usershow;
    }

    public String getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(String userinfo) {
        this.userinfo = userinfo;
    }
}
