package com.example.PaymentService.Service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String processPayment(String serviceName, double price, String currency){
        return "ServiceName: "+ serviceName +" ,price: "+ price +" ,currency: "+currency;
    }
}
