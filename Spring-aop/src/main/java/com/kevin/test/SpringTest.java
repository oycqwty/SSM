package com.kevin.test;

import com.kevin.Model.Student;
import com.kevin.dao.StudentDao;
import com.kevin.dao.StudentDaoImpl;
import com.kevin.dao.StudentDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Kevin on 2020/10/2
 */
public class SpringTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml");
//        AllCollection allCollection = (AllCollection)context.getBean("collectiondi");
//        Map<String, Object> map = allCollection.getMapElement();
//        Set<Map.Entry<String, Object>> entrySet = map.entrySet();
//        for (Map.Entry<String, Object> entry : entrySet) {
//            System.out.println(entry.getKey()+entry.getValue());
//        }
//        Student student = allCollection.getStudent();
//        System.out.println(student.getUsername());


//        Student student = (Student)context.getBean("constructordi");
//        System.out.println(student.getUsername());

        StudentDao sl = (StudentDao) context.getBean("stuImpl");
//        sl.T("");
//        sl.testAnnotionReturning();
//        sl.testAround();
        sl.testAround();
    }
}
