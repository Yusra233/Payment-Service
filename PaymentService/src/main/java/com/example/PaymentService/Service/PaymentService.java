package com.example.PaymentService.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class PaymentService {

    public String processPayment(String serviceName, double price, String currency){
        return "ServiceName: "+ serviceName +" ,price: "+ price +" ,currency: "+currency;
    }
}
