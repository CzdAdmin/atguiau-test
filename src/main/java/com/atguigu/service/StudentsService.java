package com.atguigu.service;

import com.atguigu.entity.Student;

/**
 * @author shkstart
 * @create 2022-06-27 10:21
 */
public interface StudentsService {

    void selectAll();

    int insertStudent(Student stu);

    int UpDateAgeByName(String name,int age);

    int deleteByIds(int[] id);
}
