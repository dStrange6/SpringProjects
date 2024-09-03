package com.mayank.config;

import com.mayank.Demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config
{
    public Config()
    {
        System.out.println("Config bean created");
    }

    @Bean
    public Demo createDemoObject()
    {
        return new Demo();
    }
}
