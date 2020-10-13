package com.kevin.web.Controller;

import com.kevin.web.Model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Kevin on 2020/10/4
 */
public class QueryUser extends HttpServlet {

    private String message;
    private User user;

    public void init() throws ServletException {
        // 执行必需的初始化
        message = "user info";
        //将IOC容器对象加入Serlvet容器
        ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        user = (User) ac.getBean("user");
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        // 设置响应内容类型
//        response.setContentType("text/html");
//
//        // 实际的逻辑是在这里
//        PrintWriter out = response.getWriter();
//        out.println("<h1>" + message + "</h1>");
        request.setAttribute("msg", user.getUsername());
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    public void destroy() {
        // 什么也不做
    }
}
