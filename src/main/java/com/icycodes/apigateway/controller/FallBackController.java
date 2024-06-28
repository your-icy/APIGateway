package com.icycodes.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/paymentServiceFallbackBack")
    public String paymentServiceFallbackBack(){
        return "Payment Service is Down";
    }

    @GetMapping("/productServiceFallbackBack")
    public String productServiceFallbackBack(){
        return "Product Service is Down";
    }


    @GetMapping("/orderServiceFallbackBack")
    public String orderServiceFallbackBack(){
        return "Order Service is Down";
    }

}
