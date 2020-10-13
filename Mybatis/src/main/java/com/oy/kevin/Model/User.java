package com.oy.kevin.Model;

import java.util.List;

/**
 * Created by Kevin on 2020/9/28
 */
public class User {
    //    private String username;
    private String uname;
    private int age;
    private boolean sex;
    private List<Integer> uids;
    private List<Enterprise> enterprise;


    public List<Integer> getUids() {
        return uids;
    }

    public void setUids(List<Integer> uids) {
        this.uids = uids;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
