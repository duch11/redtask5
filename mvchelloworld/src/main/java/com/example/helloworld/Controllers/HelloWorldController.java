package com.example.helloworld.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String dontGetHelloWorldTemplate(Model model){
        return "helloworld";
    }

    @GetMapping("/hello")
    public String getHelloWorldTemplate(Model model){
        model.addAttribute("hellofromcontroller", "Hello there! I've just edited the view, to display this message!");
        return "helloworld";
    }
}
