package com.kevin.web.dao;

import com.kevin.web.Model.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Kevin on 2020/10/4
 */

@Repository("usermapper")
public interface UserMapper {
    List<User> queryUser();
}
