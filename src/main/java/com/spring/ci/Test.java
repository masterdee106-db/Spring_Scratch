package com.spring.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ciconfig.xml");
        Device device1=(Device)context.getBean("device");
        Device device2= (Device) context.getBean("device2");
        Device device3 =(Device) context.getBean("device3");
        System.out.println(device1);
        System.out.println(device2);
        System.out.println(device3);
    }
}
