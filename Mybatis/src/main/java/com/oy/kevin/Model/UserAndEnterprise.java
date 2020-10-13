package com.oy.kevin.Model;

/**
 * Created by Kevin on 2020/10/1
 */
public class UserAndEnterprise {

    private String username;
    private int age;
    private Boolean sex;
    private String usershow;
    private String userinfo;

    @Override
    public String toString() {
        return "UserAndEnterprise{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", usershow='" + usershow + '\'' +
                ", userinfo='" + userinfo + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
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
