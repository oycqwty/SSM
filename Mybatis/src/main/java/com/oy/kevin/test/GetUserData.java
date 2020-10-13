package com.oy.kevin.test;

import com.oy.kevin.Dao.UserDao;
import com.oy.kevin.Model.Student;
import com.oy.kevin.Model.User;
import com.oy.kevin.Model.UserAndEnterprise;
import com.oy.kevin.Model.tClass;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;
import sun.security.tools.policytool.Resources_zh_TW;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Kevin on 2020/9/28
 */
public class GetUserData {

    public void peizhiStatement() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        String statement = "com.oy.kevin.Dao.UserDao.queryUserById";
        User user = session.selectOne(statement, "kevin");
        System.out.println(user);
        session.close();
    }

    public static void yueding() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
//        String statement="com.oy.kevin.Dao.UserDao.queryUserById";
//        User user = session.selectOne(statement, "kevin");
        UserDao userDao = session.getMapper(UserDao.class);
        User user = userDao.queryUserById("kevin");
        System.out.println(user);
        session.close();
    }

    public static void addUser() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
//        String statement="com.oy.kevin.Dao.UserDao.queryUserById";
//        User user = session.selectOne(statement, "kevin");
        UserDao userDao = session.getMapper(UserDao.class);
        User user1 = new User();
        user1.setAge(15);
//        user1.setUsername("xyz");
        user1.setSex(true);
        int i = userDao.addUser(user1);
        session.commit();
        System.out.println(i);
        session.close();
    }

    public static void queryUserOrderbyColumn() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();//
        UserDao userDao = session.getMapper(UserDao.class);
//        List<User> list = userDao.queryUserOrderbyColumn("y");
//        for (User user : list) {
//            System.out.println(user);
//        }
        Map<String, Object> map = new HashMap();
        map.put("username", "kevin");
        User user = userDao.testHashMapEnterParameter(map);
        System.out.println(user);
        session.close();
    }

    public static void procedureAndHashMap() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();//
        UserDao userDao = session.getMapper(UserDao.class);
        Map<String, Object> map = new HashMap();
        map.put("uid", 1);
        userDao.procedureAndHashMap(map);
        System.out.println(map.get("c"));
        session.close();
    }


    public static void HashMapResultParam() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();//
        UserDao userDao = session.getMapper(UserDao.class);
//        List<Map<String, Object>> list = userDao.HashMapResultParam();
        List<User> list = userDao.hashmapAndresulttypeAsMapping();
        System.out.println(list);
        session.close();
    }

    public static void foreachToCollectTag() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();//
        UserDao userDao = session.getMapper(UserDao.class);
        User user = new User();
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        user.setUids(list1);
        List<User> list = userDao.foreachToCollectTag(user);
        System.out.println(list);
        session.close();
    }

    public static void foreachToCollectTagWithArray() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();//
        UserDao userDao = session.getMapper(UserDao.class);
        int[] uids = {0, 1, 2};
        List<User> list = userDao.foreachToCollectTagWithArray(uids);
        System.out.println(list);
        session.close();
    }

    public static void foreachToCollectTagWithList() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();//
        UserDao userDao = session.getMapper(UserDao.class);
        List<Integer> uids = new ArrayList<Integer>();
        uids.add(1);
        uids.add(2);
        List<User> list = userDao.foreachToCollectTagWithList(uids);
        System.out.println(list);
        session.close();
    }

    public static void foreachToCollectTagWithObjectArray() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();//
        UserDao userDao = session.getMapper(UserDao.class);
        User user = new User();
        user.setUname("kevin");
        User user1 = new User();
        user1.setUname("oy");
        User[] users = {user, user1};
        List<User> list = userDao.foreachToCollectTagWithObjectArray(users);
        System.out.println(list);
        session.close();
    }

    public static void testUserAndEnterprise() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();//
        UserDao userDao = session.getMapper(UserDao.class);
        List<UserAndEnterprise> list12 = userDao.testUserAndEnterprise();
        System.out.println(list12);
        session.close();
    }

    public static void enterassociation() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();//
        UserDao userDao = session.getMapper(UserDao.class);
        List<User> list = userDao.enterassociation();
        System.out.println(list);
        session.close();
    }


    public static void testcollect() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();//
        UserDao userDao = session.getMapper(UserDao.class);
//        List<User> list = userDao.enterassociation();
        tClass tClass = userDao.testcollect(1);
        System.out.println(tClass);
        session.close();
    }

    /**
     * @Description: 懒加载生效  debug点开对象查看也会触发懒加载
     * @Param:
     * @Author: Kevin
     * @Date: 2020/10/7
     */
    public static void ClassAndStudentLazyload() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        UserDao userDao = session.getMapper(UserDao.class);
        List<tClass> list = userDao.ClassAndStudentLazyload(1);
        //不会加载学生信息
        System.out.println(list.get(list.size() - 1).getClassName());
        //加载学生信息
        for (tClass tClass : list) {
            for (int i = 0; i < tClass.getStudents().size(); i++) {
                Student student = tClass.getStudents().get(i);
                System.out.println(student.getUsername());
            }
        }
        session.close();
    }

    public static void main(String[] args) throws IOException {
//        addUser();
//        queryUserOrderbyColumn();
//        procedureAndHashMap();
//        HashMapResultParam();
//        foreachToCollectTag();
//        foreachToCollectTagWithArray();
//        foreachToCollectTagWithList();
//        foreachToCollectTagWithObjectArray();
//        testUserAndEnterprise();
//            enterassociation();
//        testcollect();
        ClassAndStudentLazyload();
    }
}
