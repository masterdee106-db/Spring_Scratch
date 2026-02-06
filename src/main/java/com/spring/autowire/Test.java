package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("autowireconfig.xml");
        Customer customer1 =context.getBean("customer1", Customer.class);
        System.out.println(customer1);
    }
}
