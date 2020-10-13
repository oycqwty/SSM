package com.oy.kevin.test;

import com.oy.kevin.Dao.StudentDao;
import com.oy.kevin.Model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by Kevin on 2020/10/1
 */
public class TestCache {

    public static void testcache() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();
        StudentDao studentDao = session.getMapper(StudentDao.class);
        Student student = studentDao.testcache();
        System.out.println(student);
        session.close();
        SqlSession session1 = sqlSessionFactory.openSession();
        StudentDao studentDao1 = session1.getMapper(StudentDao.class);
        Student student1 = studentDao1.testcache();
        System.out.println(student1);
        session1.close();
    }

    /**
     * @Description: sqlsession调用commit() 二级缓存失效 防止数据脏读
     * @Param:
     * @Author: Kevin
     * @Date: 2020/10/7
     */
    public static void testcachecommitoperating() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession session = sqlSessionFactory.openSession();
        StudentDao studentDao = session.getMapper(StudentDao.class);
        Student student = studentDao.testcache();
        System.out.println(student);
        session.close();

        SqlSession session0 = sqlSessionFactory.openSession();
        StudentDao studentDao0 = session0.getMapper(StudentDao.class);
        int i = studentDao0.updateStudentBysno(2);
        System.out.println("修改受影响行：" + i);
        session0.commit();

        SqlSession session1 = sqlSessionFactory.openSession();
        StudentDao studentDao1 = session1.getMapper(StudentDao.class);
        Student student1 = studentDao1.testcache();
        System.out.println(student1);
        session1.close();
    }

    public static void main(String[] args) throws IOException {
//        testcache();
        testcachecommitoperating();
    }
}
