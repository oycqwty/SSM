package com.oy.kevin.Dao;

import com.oy.kevin.Model.Student;

/**
 * Created by Kevin on 2020/10/1
 */
public interface StudentDao {
    Student testcache();

    int updateStudentBysno(int son);
}
