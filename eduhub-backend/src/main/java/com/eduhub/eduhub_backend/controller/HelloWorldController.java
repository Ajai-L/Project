package com.eduhub.eduhub_backend.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
public class HelloWorldController {
    private String message = "Hello World!";
    @GetMapping("/env")
    public String env(){
        return message;

    }
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }
}
