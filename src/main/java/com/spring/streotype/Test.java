package com.spring.streotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
       ApplicationContext conetext =new ClassPathXmlApplicationContext("streotypeconfig.xml");
       Employee employee1 =conetext.getBean("employee", Employee.class);
        System.out.println(employee1);
    }
}
