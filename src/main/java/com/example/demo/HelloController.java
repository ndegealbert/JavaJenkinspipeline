package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Handle the / endpoint (Home page)
    @GetMapping("/")
    public String home() {
        return "Welcome to the homepage getting started!";
    }

    // Define the endpoint /hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @PostMapping("/login")
    public String handlePost(@RequestBody String data) {
        // Handle the POST request data
        return "Received POST data: " + data;
    }

    
    
}
