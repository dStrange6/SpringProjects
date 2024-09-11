package com.mayank;

import com.mayank.services.DHL;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static {
        System.out.println("Main class loaded");
    }
    public Main(){
        System.out.println("Object of main class created");
    }

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");

        Amazon amz = container.getBean(Amazon.class);
        //amz.setDeliveryService(container.getBean(DHL.class));

        amz.deliverProduct(34.2f);
    }
}