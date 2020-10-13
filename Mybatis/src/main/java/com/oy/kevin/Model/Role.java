package com.oy.kevin.Model;

import java.io.Serializable;

/**
 * Created by Kevin on 2020/10/7
 */
public class Role implements Serializable {
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Role{" +
                "role='" + role + '\'' +
                '}';
    }
}
