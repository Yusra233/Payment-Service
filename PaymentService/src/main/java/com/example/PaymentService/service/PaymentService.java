package com.example.PaymentService.service;

import org.springframework.stereotype.Service;
import org.example.model.PaymentRequest;

@Service
public class PaymentService {
    public PaymentRequest processPayment(PaymentRequest paymentRequest)
    {
        return paymentRequest;
    }
}
