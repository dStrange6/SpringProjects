package com.mayank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{


    public static void main(String[] args)
    {
        //ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
        ApplicationContext container = new ClassPathXmlApplicationContext("exampleconfig.xml");



        Amazon amz = container.getBean(Amazon.class);

        System.out.println(amz.str);

        String str = container.getBean(String.class);
        System.out.println(str);
        //amz.deliverProduct(33.4f);
        //amz.demoMessage();

        //---------------experimenting----------------
//        System.out.println(container.getBeanDefinitionCount());
//
//        String[] beans = container.getBeanDefinitionNames();
//
//        for(int i=0;i<container.getBeanDefinitionCount();i++)
//        {
//            System.out.println(beans[i]);
//        }
//        System.out.println(new Amazon());


    }
}