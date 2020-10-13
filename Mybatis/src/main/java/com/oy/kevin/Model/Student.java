package com.oy.kevin.Model;

import java.io.Serializable;

/**
 * Created by Kevin on 2020/10/1
 */
public class Student implements Serializable {
    private int sno;
    private String username;
    private String classid;
    private int age;


    public Student() {
    }


    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                ", username='" + username + '\'' +
                ", classid='" + classid + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(int sno, String username, String classid, int age) {
        this.sno = sno;
        this.username = username;
        this.classid = classid;
        this.age = age;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
