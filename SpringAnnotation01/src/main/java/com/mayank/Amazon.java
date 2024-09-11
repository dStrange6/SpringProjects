package com.mayank;

import com.mayank.services.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Amazon {
    //System.out.println();

    static {
        System.out.println("Amazon class loaded");
    }
//    @Autowired
//    @Qualifier("dhl")  //field injection using autowired and qualifier
    public DeliveryService deliveryService;

//    @Autowired
//    @Qualifier("fedex")   //setter injection using autowired and qualifier
    public void setDeliveryService(DeliveryService deliveryService)
    {
        this.deliveryService = deliveryService;
    }
    @Autowired
    //@Qualifier  --> qualifier cannot be applied to a constructor
    public Amazon(@Qualifier("fedex") DeliveryService deliveryService)    //simply applying qualifier to a local variable is allowed
    {
        System.out.println("Param constructor of Amazon class called");
        this.deliveryService = deliveryService;
    }
    public Amazon()
    {
        System.out.println("Object of Amazon class created");
    }

    public void deliverProduct(float amount)
    {
        this.deliveryService.productDelivered(amount);
    }
}
