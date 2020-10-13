package com.oy.kevin.Model;

import java.util.List;

/**
 * Created by Kevin on 2020/10/1
 */
public class tClass {
    private String className;
    private String classid;
    private List<Student> students;


    @Override
    public String toString() {
        return "tClass{" +
                "className='" + className + '\'' +
                ", classid='" + classid + '\'' +
                ", students=" + students +
                '}';
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
