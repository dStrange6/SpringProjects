package com.mayank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Greetme
{
    @Autowired
    private LocalDateTime localDateTime;

    public Greetme()
    {
        System.out.println("Greetme class bean created using default constructor");
    }
    public void greetLogic()
    {
        System.out.println(localDateTime.getMinute());
    }
}
