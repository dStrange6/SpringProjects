package com.mayank.services;

public class FedEx implements DeliveryService {

    static {
        System.out.println("FedEx class loaded");
    }
    public FedEx() {
        System.out.println("Object of FedEx class created.");
    }

    @Override
    public boolean productDelivered(float amount) {
        System.out.println("Product delivered using FedEx. Amount - "+amount);
        return true;
    }
}
