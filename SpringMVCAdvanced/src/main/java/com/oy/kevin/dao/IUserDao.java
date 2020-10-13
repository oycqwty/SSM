package com.oy.kevin.dao;


import com.oy.kevin.model.User;

public interface IUserDao {

    User selectUser(long id);
}
