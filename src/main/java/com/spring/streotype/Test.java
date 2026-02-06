package com.spring.streotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
       ApplicationContext conetext =new ClassPathXmlApplicationContext("streotypeconfig.xml");
       Employee employee1 =conetext.getBean("employee", Employee.class);
        System.out.println(employee1);
        System.out.println(employee1.hashCode());
// So here you can see that i am calling 2 times the object hascode and this hashcode is same for both the object
//        Usually when you creating an object it has some unique hashCode but here I am getting same hashcode means here its creating only one object whatever time you want...
//        Now go to Employee.class and check over there I am changing the scope to Prototype and then come here
        Employee employee2 = conetext.getBean("employee", Employee.class);
        System.out.println(employee2.hashCode());

//758119607
//1982787818
//        This is 2 different object created for each time creating object by implementing prototype bean-scope

    }
}
