package com.hello.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemocController {
    @GetMapping(value = "/hello")
    public String getHello() {
        return "Hello";
    }
}
