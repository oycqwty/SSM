package com.oy.kevin.Dao;

import com.oy.kevin.Model.Student;
import com.oy.kevin.Model.User;
import com.oy.kevin.Model.UserAndEnterprise;
import com.oy.kevin.Model.tClass;

import java.util.List;
import java.util.Map;

/**
 * Created by Kevin on 2020/9/28
 */
public interface UserDao {
    User queryUserById(String username);

    int addUser(User user);

    List<User> queryUserOrderbyColumn(String column);

    User testHashMapEnterParameter(Map<String, Object> map);

    void procedureAndHashMap(Map<String, Object> map);

    List<Map<String, Object>> HashMapResultParam();

    List<User> hashmapAndresulttypeAsMapping();

    List<User> foreachToCollectTag(User user);

    List<User> foreachToCollectTagWithArray(int[] uids);

    List<User> foreachToCollectTagWithList(List<Integer> uids);

    List<User> foreachToCollectTagWithObjectArray(User[] users);

    List<UserAndEnterprise> testUserAndEnterprise();

    List<User> enterassociation();

    tClass testcollect(int classid);

    List<Student> lazyStudent();

    List<tClass> ClassAndStudentLazyload(int classid);

//    List<Student> lazyStudent1();
}
