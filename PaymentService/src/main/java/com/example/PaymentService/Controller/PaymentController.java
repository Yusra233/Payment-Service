package com.example.PaymentService.Controller;

import com.example.PaymentService.Service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public String pay(@RequestParam String serviceName,@RequestParam double price,@RequestParam String currency){
       logger.info("Payment Done Successfully");
        return paymentService.processPayment(serviceName,price,currency);
    }
}
