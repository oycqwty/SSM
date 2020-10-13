package com.oy.kevin.test;

import com.oy.kevin.Dao.TwoLearnDao;
import com.oy.kevin.Model.Student;
import com.oy.kevin.Model.Tuser;
import com.oy.kevin.Model.User;
import com.oy.kevin.Model.tClass;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Kevin on 2020/10/6
 */
public class TwoLearn {
    public static void main(String[] args) throws IOException {
//        test$ValueisParam();
//        test$HashmapisParam();
//        transferProcedureAsHasnmap();
//        ObjParamRmap();
//        dynamicSqltoForeach();
//        associationObject();
//        lazyloadStudent();
        firstLevelCache();
    }

    private static void test$ValueisParam() throws IOException {
        //        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sessionFactory.openSession();
        TwoLearnDao mapper = sqlSession.getMapper(TwoLearnDao.class);
        List<User> list = mapper.queryUsers("kevin", "oy");
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    private static void test$HashmapisParam() throws IOException {
        //        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sessionFactory.openSession();
        TwoLearnDao mapper = sqlSession.getMapper(TwoLearnDao.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", "kevin");
        map.put("age", 12);
        List<User> list = mapper.queUsersByHashMap(map);
        for (User user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    private static void transferProcedureAsHasnmap() throws IOException {
        //        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sessionFactory.openSession();
        TwoLearnDao mapper = sqlSession.getMapper(TwoLearnDao.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("ip", 1);
        mapper.creareProcedureTohasnmap(map);
        Object op = map.get("op");
        System.out.println(op);
        sqlSession.close();
    }


    /**
     * @Description: 对象传值，动态sql之where if
     * @Param:
     * @Author: Kevin
     * @Date: 2020/10/7
     */
    public static void ObjParamRmap() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sessionFactory.openSession();
        TwoLearnDao mapper = sqlSession.getMapper(TwoLearnDao.class);
        com.oy.kevin.Model.TwoLearn learn = new com.oy.kevin.Model.TwoLearn();
        learn.setUname("kevin");
//        learn.setAge(12);
        List<com.oy.kevin.Model.TwoLearn> list = mapper.queryUser1(learn);
        for (com.oy.kevin.Model.TwoLearn user : list) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    /**
     * @Description: 动态sql:foreach array list 对象的集合属性
     * @Param:
     * @Author: Kevin
     * @Date: 2020/10/7
     */
    public static void dynamicSqltoForeach() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sessionFactory.openSession();
        TwoLearnDao mapper = sqlSession.getMapper(TwoLearnDao.class);
//        int[] arr = {2,3};
//        List<Tuser> tusers = mapper.dynamicSqltoForeach(arr);

//        List<Integer> list= new ArrayList<Integer>();
//        list.add(2);
//        list.add(3);
//        List<Tuser> users = mapper.dynamicSqltoForeachAslist(list);
//        Tuser tuser1 = new Tuser();tuser1.setUsername("xjt");
//        Tuser tuser2 = new Tuser();tuser2.setUsername("欧阳创奇");
//        Object[] array = {tuser1,tuser2};
//        List<Tuser> users = mapper.dynamicSqltoForeachAsObjectArray(array);
        Tuser tuser = new Tuser();
        List<String> list = new ArrayList<String>();
        list.add("15678635432");
        list.add("11111111111");
        tuser.setMobile(list);
        List<Tuser> users = mapper.dynamicSqltoForeachAsObjectPropertyList(tuser);
        for (Tuser user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    /**
     * @Description: 一对多
     * @Param:
     * @Author: Kevin
     * @Date: 2020/10/7
     */
    public static void associationObject() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        TwoLearnDao mapper = session.getMapper(TwoLearnDao.class);
        tClass tClasses = mapper.oneToCollection(1);
        System.out.println(tClasses);
        for (Student tClass : tClasses.getStudents()) {
            System.out.println(tClass);
        }
    }

    /**
     * @Description: 测试懒加载
     * @Param:
     * @Author: Kevin
     * @Date: 2020/10/7
     */
    public static void lazyloadStudent() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        TwoLearnDao mapper = session.getMapper(TwoLearnDao.class);
        tClass tClass = mapper.lazyloadStudent();
        System.out.println(tClass.getClassName());
        session.close();
    }

    public static void firstLevelCache() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sessionFactory.openSession();
        TwoLearnDao mapper = session.getMapper(TwoLearnDao.class);
        mapper.firstLevelCache();
        mapper.firstLevelCache();
        session.close();
//        SqlSession session1 = sessionFactory.openSession();
//        TwoLearnDao mapper1 = session1.getMapper(TwoLearnDao.class);
//        mapper1.firstLevelCache();
//        session1.close();
    }

    /**
     * @Description: 正常操作：增删改 不要忘记session commit()  用完的close()
     * 此方式事务默认提交类型为JDBC
     * @Param:
     * @Author: Kevin
     * @Date: 2020/10/7
     */
    public static Object MybatisConnectDBTemplate(Class objInterface) {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            SqlSession session = sessionFactory.openSession();
//            Object mapper = session.getMapper(objInterface.getClass());
            Object mapper = session.getMapper(objInterface);
            return mapper;
        } catch (IOException e) {
//            System.out.println("数据库配置出错");
//            return null;
            throw new RuntimeException("数据库配置出错");
        }
    }
}
