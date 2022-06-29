package com.atguigu.dao;


import com.atguigu.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author shkstart
 * @create 2022-06-27 9:55
 */
public interface Students {

    List<Student> selectAll();

    int insertStudent(Student stu);

    int UpDateAgeByName(@Param("Name") String name,@Param("Age") int age);

    int deleteByIds(int[] id);
}
