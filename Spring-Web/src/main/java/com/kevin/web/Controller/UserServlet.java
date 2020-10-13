package com.kevin.web.Controller;

import com.kevin.web.Model.User;
import com.kevin.web.dao.TestAutowiredModel;
import com.kevin.web.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Kevin on 2020/10/4
 */
public class UserServlet extends HttpServlet {

    @Autowired
    public UserMapper userMapperr;

    @Autowired
    private TestAutowiredModel autowiredModel;

    public void init() {
        ApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        System.out.println(this.autowiredModel);
        userMapperr = (UserMapper) ac.getBean("usermapper");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> list = userMapperr.queryUser();
        StringBuffer sb = new StringBuffer();
        for (User user : list) {
            sb.append(user.getUsername() + " ");
        }
        request.setAttribute("userAllnames", sb.toString());
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
//    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doGet(request, response);
//    }
//    public void destory(){
//        System.out.println("销毁");
//    }
}
