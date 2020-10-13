package com.kevin.web.Controller;

import com.kevin.web.Model.User;
import com.kevin.web.dao.UserMapper;
import com.kevin.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Kevin on 2020/10/4
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired(required = false)
    private UserMapper userMapper;


    //    @Autowired
//    @Qualifier("us")
//    @Resource(name = "us")
//    @Resource(type = UserService.class)
    @Resource
    private UserService us;


    public UserService getUserService() {
        return us;
    }

    public void setUserService(UserService userService) {
        this.us = userService;
    }

    @RequestMapping("queryuser")
    @ResponseBody
    public List<User> queryUser() {
        List<User> list = this.userMapper.queryUser();
        return list;
    }
}
