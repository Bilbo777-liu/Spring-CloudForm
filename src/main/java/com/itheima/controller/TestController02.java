package com.itheima.controller;

import com.itheima.pojo.Student;
import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController02 {

    @Value("${name}")
    private String name;

    @Value("${city[0]}")
    private String city;

    @Value("${student.name}")
    private String studentName;

    @Value("${person.name}")
    private String personName;

    @Value("${map.name}")
    private String mapsName;
    @Autowired
    private Environment environment;

    @Autowired
    private Student student;

    @RequestMapping("/show")
    public String showHello(){
        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("personName = " + personName);
        System.out.println("mapsName = " + mapsName);


        return "never use show hello world ????";
    }

}
