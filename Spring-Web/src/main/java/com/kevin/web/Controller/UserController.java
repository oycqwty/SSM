package com.kevin.web.Controller;

import com.kevin.web.Model.User;
import com.kevin.web.dao.TestAutowiredModel;
import com.kevin.web.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Kevin on 2020/10/4
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    public UserMapper userMapper;

    @Autowired
    private TestAutowiredModel autowiredModel;

    @RequestMapping("queryuser")
    @ResponseBody
    public List<User> queryUser() {
        System.out.println(userMapper + " " + autowiredModel);
        List<User> list = this.userMapper.queryUser();
        return list;
    }
}
