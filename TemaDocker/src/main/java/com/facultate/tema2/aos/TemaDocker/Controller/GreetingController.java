package com.facultate.tema2.aos.TemaDocker.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {


    @RequestMapping("/")
    public String greeting() {
        return "Hello World";
    }
    
    @RequestMapping("/name")
    public String greeting(@RequestParam(value="name")String name ) {
        return "Hello " + name;
    }
}
