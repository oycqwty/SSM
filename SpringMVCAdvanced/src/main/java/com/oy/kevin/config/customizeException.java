package com.oy.kevin.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Kevin on 2020/9/27
 */
@ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason = "触发自定义异常")
public class customizeException extends Exception {
}
