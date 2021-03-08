package com.baidu.controller;

import com.baidu.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName TestController
 * @Description: TODO
 * @Author wyj
 * @Date 2021/3/7
 * @Version V1.0
 **/
@Controller  //controller可以返回页面
public class TestController {

    @GetMapping("test")  //定义url使用modelmap返回数据
    public String test(ModelMap map){
        map.put("name","tomcat");
        return "test";
    }

    @GetMapping("test1")  //定义url使用modelmap返回数据
    public String test1( ){
        return "test1";
    }
    /*
    展示学生
     */
    @GetMapping("stu")
    public String student(ModelMap map){
        Student student = new Student();
        student.setCode("周杰伦");
        student.setPass("9527");
        student.setAge(22);
        student.setLikeColor("<font color='red'>红色</font>");
        map.put("stu",student);
        return "student";
    }

    @GetMapping("list")
    public String list(ModelMap map){
        Student s1 = new Student("李白", "3333", 22, "red");
        Student s2 = new Student("杜甫", "444", 33, "red");
        Student s3 = new Student("李清照", "555", 44, "red");
        Student s4 = new Student("苏轼", "666", 55, "red");
        Student s5 = new Student("陶渊明", "777", 66, "red");
        map.put("stuList", Arrays.asList(s1,s2,s3,s4,s5));
        return "list";
    }


}
