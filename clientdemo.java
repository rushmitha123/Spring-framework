package com.klef.jfsd.exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve Employee bean
        Employee employee = (Employee) context.getBean("employee");
        System.out.println("Employee Details:");
        System.out.println(employee);

        // Retrieve Course bean
        Course course = (Course) context.getBean("course");
        System.out.println("\nCourse Details:");
        System.out.println(course);
    }
}
