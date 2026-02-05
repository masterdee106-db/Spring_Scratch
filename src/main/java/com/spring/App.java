package com.spring;

import com.spring.ref.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Added a new line and pushed it to the git...");
        ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
//        Student student1 = (Student) context.getBean("student1", Student.class);
//        System.out.println(student1);

//        Student student2 =(Student) context.getBean("student1");
//        System.out.println(student2);

        System.out.println("Implementing reference type in config file how a dependency is added through reference");
        A temp = (A)context.getBean("aref");
        System.out.println(temp.getX());
        System.out.println(temp.getOb().getY());



        System.out.println("Addedd another line ");
    }
}
