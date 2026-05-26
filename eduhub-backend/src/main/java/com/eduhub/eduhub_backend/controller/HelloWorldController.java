package com.eduhub.eduhub_backend.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloWorldController {
    @GetMapping( "/helloworld")
    public String helloWorld() {
        return "Hello World!";
    }
}