package com.oy.kevin.controller;

import com.oy.kevin.model.User;
import com.oy.kevin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    //    @RequestMapping("select")
//    @ResponseBody
//    public ModelAndView selectUser() throws Exception {
//        ModelAndView mv = new ModelAndView();
//        User user = userService.selectUser(1);
//        mv.addObject("user", user);
//        mv.setViewName("user");
//        return mv;
//    }
    @RequestMapping("select")
    @ResponseBody
    public User selectUser(@RequestParam("userid") String userid) throws Exception {
        System.out.println("进来了 " + userid);
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("user", user);
//        mv.setViewName("user");
        return userService.selectUser(Integer.parseInt(userid));
    }
}
