package com.mayank.controller;

import org.springframework.stereotype.Controller;

@Controller("controller") //since I have specified now the reference variable or bean id will be controller
public class SpringController //here the reference variable will be in camel case i.e. springController if I don't specify
{
    public SpringController()
    {
        System.out.println("SpringController bean created");
    }
    public void Logic()
    {
        System.out.println("Controller logic is present here");
    }
}
