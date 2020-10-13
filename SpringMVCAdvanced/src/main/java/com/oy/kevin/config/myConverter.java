package com.oy.kevin.config;

import com.oy.kevin.model.User;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;

/**
 * Created by Kevin on 2020/9/27
 */
public class myConverter implements Converter<String, User> {
    public User convert(String s) {
        String[] strings = s.split("-");
        User user = new User();
        user.setId(Integer.parseInt(strings[0]));
        user.setUsername(strings[1]);
        return user;
    }
}
