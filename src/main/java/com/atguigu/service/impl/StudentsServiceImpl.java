package com.atguigu.service.impl;

import com.atguigu.dao.Students;
import com.atguigu.entity.Student;
import com.atguigu.service.StudentsService;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

/**
 * @author shkstart
 * @create 2022-06-27 10:22
 */
public class StudentsServiceImpl implements StudentsService {

    private Students students;

    public void setStudents(Students students) {
        this.students = students;
    }

    @Override
    public void selectAll() {
        List<Student> studentList = this.students.selectAll();
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()){
           Student stu = iterator.next();
           if (stu.getId() <= 10){
               System.out.println(stu);
           }
        }
    }

    @Override
    public int insertStudent(Student stu) {
        int i = students.insertStudent(stu);
        return i;
    }

    @Override
    public int UpDateAgeByName(String name, int age) {
        int i = students.UpDateAgeByName(name, age);
        return i;
    }

    @Override
    public int deleteByIds(int[] id) {
        int i = students.deleteByIds(id);
        return i;
    }
}
