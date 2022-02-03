package com.sourcedrift.microservices.gatewayservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallback(){
        return "User Service taking longer than expected to respond. Please try again";
    }

    @GetMapping("/departmentServiceFallback")
    public String departmentServiceFallback(){
        return "Department Service taking longer than expected to respond. Please try again";
    }
}
