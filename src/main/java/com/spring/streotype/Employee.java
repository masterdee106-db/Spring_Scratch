package com.spring.streotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Here also i am mentioning Bean scope concept which mean you can give scope for the beans
//1. SingleTone: Only ONE instance of the bean is created per Spring IoC container, and the same instance is shared everywhere it’s used.
//2. ProtoType: In prototype scope, Spring creates a NEW object every time the bean is requested.
//3. Request: will discuss later in the http methods topics when come
//4. Session: Will discuss it later...

@Component
@Scope("prototype")
public class Employee {
    @Value("Deepan Behera")
    private String employeeName;
    @Value("Java Full Stack Developer")
    private String employeeDomain;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDomain() {
        return employeeDomain;
    }

    public void setEmployeeDomain(String employeeDomain) {
        this.employeeDomain = employeeDomain;
    }

    public Employee(String employeeName, String employeeDomain) {
        this.employeeName = employeeName;
        this.employeeDomain = employeeDomain;
    }
    public Employee(){
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeDomain='" + employeeDomain + '\'' +
                '}';
    }
}
