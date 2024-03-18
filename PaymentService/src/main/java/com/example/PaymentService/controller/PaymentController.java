package com.example.PaymentService.controller;

import com.example.PaymentService.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.model.PaymentRequest;


@RestController
@RequestMapping("/Payment")
public class PaymentController {
    private final PaymentService paymentService;
    private static final Logger logger= LoggerFactory.getLogger(PaymentController.class);

    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/pay")
    public PaymentRequest pay(@RequestBody PaymentRequest paymentRequest){
       logger.info("Payment Done Successfully");
        return paymentService.processPayment(paymentRequest);
    }
}
