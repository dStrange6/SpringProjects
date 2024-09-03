package com.mayank;

import com.mayank.controller.SpringController;
import com.mayank.dao.DAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("appconfig.xml");

//       SpringController controller = container.getBean(SpringController.class);
//        controller.Logic();

        //downcast needs to be done Object type to DAO type while using
        //getBean() method with bean id
        DAO dao = (DAO) container.getBean("dao");

        //as we can see bean id "controller" is used
        SpringController controller = (SpringController) container.getBean("controller");
        controller.Logic();
    }
}