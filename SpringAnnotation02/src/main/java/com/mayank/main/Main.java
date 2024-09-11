package com.mayank.main;

// In this program we are using pure java configurations(annotations) and no XML

import com.mayank.config.JavaConfiguration;
import com.mayank.service.Greetme;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args)
    {
        ApplicationContext container = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        Greetme gm = container.getBean(Greetme.class);

        gm.greetLogic();
    }
}