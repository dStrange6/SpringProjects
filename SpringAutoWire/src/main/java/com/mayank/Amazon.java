package com.mayank;

import com.mayank.services.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;

public class Amazon
{
    static
    {
        System.out.println("Amazon class loaded");
    }

    public void setStr(String str) {
        System.out.println("Bean created for str");
        this.str = str;
    }

    public DeliveryService deliveryService;
    public Demo demo;
    public String str;

    public void setDemo(Demo demo) {
        System.out.println("Set Demo called");

        this.demo = demo;
    }

    public Amazon()
    {
        System.out.println("default constructor");
        System.out.println("Object of Amazon class created");
    }
    public Amazon(DeliveryService deliveryService)
    {
        System.out.println("constructor with one arg");
        this.deliveryService = deliveryService;
    }
    public Amazon(DeliveryService deliveryService, Demo demo)
    {
        System.out.println("constructor with two arg");
        this.deliveryService = deliveryService;
        this.demo = demo;
    }

    public void setDeliveryService(DeliveryService deliveryService) {
        System.out.println("Set DeliveryService called");

        this.deliveryService = deliveryService;
    }

    public void deliverProduct(float amount)
    {
        this.deliveryService.productDelivered(amount);
    }

    public void demoMessage()
    {
        this.demo.demoMessage();
    }
}
