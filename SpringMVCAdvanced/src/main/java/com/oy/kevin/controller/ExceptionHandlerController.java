package com.oy.kevin.controller;

import com.oy.kevin.config.customizeException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Kevin on 2020/9/27
 */
@Controller
@RequestMapping("exception")
public class ExceptionHandlerController {

    @RequestMapping("handler")
    @ResponseBody
    public String effect() {
        int i = 1 / 0;
        return "success";
    }

    //    @ExceptionHandler(value = {ArithmeticException.class})
    public void handler() {
        System.out.println("处理了算术异常");
    }

    @RequestMapping("handler1")
    public String effect1() {
        return "redirect:handler2";
    }

    @RequestMapping("handler2")
    @ResponseBody
    public String effect2() throws customizeException {
        throw new customizeException();
//        return "successhhh";
    }

    @ResponseBody
    @RequestMapping("testSimpleMappingExceptionResolver")
    public String test11() {
        int i = 1 / 0;
        return "";
    }
}
