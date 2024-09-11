package com.mayank.services;

public class DHL implements DeliveryService {

    static {
        System.out.println("DHL class loaded");
    }

    public DHL() {
        System.out.println("Object of DHL class created.");
    }

    @Override
    public boolean productDelivered(float amount) {
        System.out.println("Product delivered using DHL. Amount - "+amount);
        return true;
    }
}
