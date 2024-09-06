package com.mayank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
        Amazon amz = container.getBean(Amazon.class);

        //amz.deliverProduct(33.4f);
        //amz.demoMessage();
    }
}