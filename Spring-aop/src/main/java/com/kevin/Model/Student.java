package com.kevin.Model;

/**
 * Created by Kevin on 2020/10/2
 */
public class Student {
    private String username;
    private int age;
    private int sno;

    public Student(String username, int age, int sno) {
        this.username = username;
        this.age = age;
        this.sno = sno;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", sno=" + sno +
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

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }
}
