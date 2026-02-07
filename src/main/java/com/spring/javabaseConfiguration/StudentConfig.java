package com.spring.javabaseConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//@Configuration is used to define Spring beans using Java configuration
//@ComponentScan is used to scan packages and automatically detect Spring components.
@Configuration
@ComponentScan(basePackages = "com.spring.javabaseConfiguration")
public class StudentConfig {
}
