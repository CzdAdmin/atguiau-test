package com.atguigu;

import com.atguigu.entity.Student;
import com.atguigu.service.StudentsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shkstart
 * @create 2022-06-27 10:52
 */
public class MyTest {

    @Test
    public void myTest01(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationConfig.xml");

        StudentsService serviceImpl = (StudentsService) ac.getBean("studentsServiceImpl");

//        serviceImpl.selectAll();

//        int result = serviceImpl.insertStudent(new Student(11, "阿张", 18, "178@qq.com"));
//        System.out.println("result ===" + result);

//        int result = serviceImpl.UpDateAgeByName("张飞", 99);
//        System.out.println("result ===" + result);

        int result = serviceImpl.deleteByIds(new int[]{8, 9, 20});
        System.out.println("result ===" + result);

    }


}
