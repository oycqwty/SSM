package com.oy.kevin.Model;

/**
 * Created by Kevin on 2020/10/7
 */
public class TwoLearn {
    private String uname;
    private int age;
    private boolean sex;

    @Override
    public String toString() {
        return "TwoLearn{" +
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
