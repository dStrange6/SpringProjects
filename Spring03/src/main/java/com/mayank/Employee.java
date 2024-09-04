package com.mayank;

public class Employee
{
    static
    {
        System.out.println("Employee class loaded");
    }
    private int age;
    private double salary;
    private String name;
    private String post;

    public Employee(int age, double salary, String name, String post) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.post = post;
        System.out.println("Param constructor called");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}
