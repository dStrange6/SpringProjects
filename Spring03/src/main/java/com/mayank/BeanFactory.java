package com.mayank;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanFactory
{
    public static void main(String[] args)
    {
//        Resource resource = new ClassPathResource("appconfig.xml");
//        BeanFactory container =  new XmlBeanFactory(resource);    //deprecated

        //lazy loading -- no bean will be created until we do getBean()
        DefaultListableBeanFactory container = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(container);
        reader.loadBeanDefinitions("appconfig.xml");
//        reader.loadBeanDefinitions("appconfig2.xml");   --> loading a second config file with the same container

        //the above process is longer hence we avoid using BeanFactory
        //but the above method has one advantage --->
        //with a single container we can load multiple config files which we cannot do
        //while using ApplicationContext

        Employee emp1 = (Employee) container.getBean("emp1");    //bean is created at this point
        System.out.println(emp1.toString());
        Employee emp2 = (Employee) container.getBean("emp2");    //bean is created at this point
        System.out.println(emp2.toString());
    }
}
