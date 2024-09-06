package com.mayank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        //eager loading
//        ApplicationContext container = new ClassPathXmlApplicationContext("appconfig.xml");

        ApplicationContext container = new ClassPathXmlApplicationContext("appconfig.xml","appconfig1.xml");

//        Employee emp = container.getBean(Employee.class);
//        String result = emp.toString();
//        System.out.println(result);

        //if you multiple beans of same class you have to get them using the bean id, otherwise
        //an error will be thrown -> "expected single matching bean but found 2"
        Employee emp1 = (Employee) container.getBean("emp1");
        Employee emp2 = (Employee) container.getBean("emp2");
        String res = emp1.toString();
        System.out.println(res);
        res = emp2.toString();
        System.out.println(res);


        /////////////////////////////////

        Employee emp4 = (Employee) container.getBean("emp4");
        System.out.println(emp4);
    }
}