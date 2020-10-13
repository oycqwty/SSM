package com.kevin.Model;

import java.util.List;
import java.util.Map;

/**
 * Created by Kevin on 2020/10/8
 */
public class AllCollection {
    private List<Integer> listElement;
    private Map<String, Object> mapElement;
    private Student stu;

    public List<Integer> getListElement() {
        return listElement;
    }

    public void setListElement(List<Integer> listElement) {
        this.listElement = listElement;
    }

    public Map<String, Object> getMapElement() {
        return mapElement;
    }

    public void setMapElement(Map<String, Object> mapElement) {
        this.mapElement = mapElement;
    }

    public Student getStu() {
        return stu;
    }

//    public void setStu(Student stu) {
//        this.stu = stu;
//    }
}
