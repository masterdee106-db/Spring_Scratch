package com.spring.streotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
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
