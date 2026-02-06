package com.spring.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("autowireannotationconfig.xml");
        Customer customer1 =context.getBean("customer1", Customer.class);
        System.out.println(customer1);
    }
}
