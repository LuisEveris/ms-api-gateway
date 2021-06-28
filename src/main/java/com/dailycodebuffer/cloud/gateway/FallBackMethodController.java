package com.dailycodebuffer.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/productServiceFallBack")
    public String productServiceFallBack() {
        return "Product Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/clientServiceFallBack")
    public String clientServiceFallBack() {
        return "Client Service is taking longer than Expected." +
                " Please try again later";
    }

    @GetMapping("/salesServiceFallBack")
    public String salesServiceFallBack() {
        return "Sales Service is taking longer than Expected." +
                " Please try again later";
    }
}
