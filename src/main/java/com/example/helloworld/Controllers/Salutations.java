package com.example.helloworld.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Salutations")
public class Salutations {
    @GetMapping("/Hi")
    public String sayHi(@RequestParam(value = "name") String name) {
        return "Hi " + name;
    }

    @GetMapping("/Hello")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name;
    }

    @GetMapping("/Generic")
    public String sayGeneric() {
        return "Generic!";
    }

}
