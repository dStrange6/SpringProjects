package com.mayank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
@ComponentScan(basePackages = {"com.mayank"})
public class JavaConfiguration
{
    public JavaConfiguration()
    {
        System.out.println("JavaConfiguration class bean created using default constructor");
    }

    @Bean
    public LocalDateTime getTimeBean()
    {
        System.out.println("Object of LocalDateTime created manually and marked as a bean");
        return LocalDateTime.now();
    }
}
