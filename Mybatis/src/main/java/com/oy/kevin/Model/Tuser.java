package com.oy.kevin.Model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Kevin on 2020/10/7
 */
public class Tuser implements Serializable {
    private int id;
    private String username;
    private String eamil;
    private List<String> mobile;
    private Role role;

    public List<String> getMobile() {
        return mobile;
    }

    public void setMobile(List<String> mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Tuser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", eamil='" + eamil + '\'' +
                ", mobile=" + mobile +
                ", role=" + role +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }
}
