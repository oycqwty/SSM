package com.oy.kevin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * @Description: 测试
 * @Param:
 * @Author: Kevin
 * @Date: 2020/9/22
 */
@Controller
@RequestMapping("request")
@SessionAttributes(types = {HashMap.class, ArrayList.class, String.class, TestController.User.class})
public class TestController {

    @Qualifier

    @RequestMapping("/redirect1")
    @ResponseBody
    public String testOne1(HttpSession session, HttpServletRequest request, ModelMap map) {
//        request.setAttribute("str","哈哈哈");
        String str = new String("str");
        User user = new User();
        user.setAge(18);
        map.put("str", user);
        System.out.println(session.getAttribute("str"));
        return str;
    }

    @RequestMapping("/redirect")
    public String testOne() {
        return "index";
    }

    @RequestMapping("/convertjson")
    @ResponseBody
    public User testTwo() {
        User user = new User();
        user.setName("kevin_numberone");
        user.setAge(23);
        return user;
    }

    @RequestMapping("iterator_arraylist")
    @ResponseBody
    public String iterator_arraylist() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("kevin");
        list.add("number one");
        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            str+=iterator.next();
//            str+=" ";
//        }
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("java", "");
        hashMap.put("C++", "");
        hashMap.put("前端", "");
        Iterator<Map.Entry<String, String>> iterator1 = hashMap.entrySet().iterator();
        String str = "";
        while (iterator1.hasNext()) {
            str += iterator1.next().getKey();
            str += " ";
        }
        return str;
    }

    @RequestMapping(value = "springmvc",
            method = RequestMethod.GET,
            params = {"name=kevin", "age=18", "!height"})
    @ResponseBody
    public String T() {
        return "T";
    }

    @RequestMapping(value = "a/*/c")
    @ResponseBody
    public String TT() {
        return "T";
    }

    @RequestMapping(value = "restful/{id}")
    @ResponseBody
    public String testRestful(@PathVariable("id") String id) {
        System.out.println(id);
        return "T";
    }

    @RequestMapping(value = "restful")
    @ResponseBody
    public String testRestful1(@RequestHeader(value = "User-Agent") String all) {
        System.out.println(all);
//        return "T";
        return "浏览器,系统信息:" + all;
    }

    @RequestMapping("yuesefu/{capacity}/{identity}")
    @ResponseBody
    public static int yuesefu1(@PathVariable("capacity") String capacity,
                               @PathVariable("identity") String identity) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < Integer.parseInt(capacity); i++) {
            list.add(i);
        }
        int count = 0, index = 0;//分别记录当前遍历的次数和目前遍历相对于整个集合所处的位置
        while (list.size() > 1) {
            count++;
            if (index >= list.size()) {//一圈下来了 重新绕
                index = 0;
            }
            if (count == Integer.parseInt(identity)) {
                list.remove(index);
                count = 0;
                index--;
            }
            index++;
        }
        return list.get(0);
    }

    @ResponseBody
    @RequestMapping("getCookieValue")
    public String getCookieValue(@CookieValue("JSESSIONID") String jsessionid) {
        System.out.println(jsessionid);
        return jsessionid;
    }

    //    @ModelAttribute
    public void testModelAttribute(Map<String, String> map) {
        map.put("user", "name:kevin age:18");
    }

    //
    @RequestMapping("testmodelAttribute")
    @ResponseBody
    public String testModelAttribute(@ModelAttribute("user") String user) {
        System.out.println(user);
        return user;
    }

    @RequestMapping("testredirect11")
    public String ff() {
        return "redirect:index";
//        return "forward:/jsp/index.jsp";
    }

    @RequestMapping("redirect2")
    public String fff() {
        return "index";
    }

    @RequestMapping("typeconvert/{source}")
    @ResponseBody
    public com.oy.kevin.model.User vv(@PathVariable("source") com.oy.kevin.model.User user) {
        return user;
    }


    static class User {
        private String name;
        private Integer age;

        public User() {
        }

        public User(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}