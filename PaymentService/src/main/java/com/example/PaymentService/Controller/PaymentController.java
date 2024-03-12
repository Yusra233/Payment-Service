package com.example.PaymentService.Controller;

import com.example.PaymentService.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Payment")
public class PaymentController {


    private final PaymentService paymentService;
    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }



    @PostMapping("/pay")
    public String pay(@RequestParam String serviceName,@RequestParam double price,@RequestParam String currency){
        return paymentService.processPayment(serviceName,price,currency);
    }
}
