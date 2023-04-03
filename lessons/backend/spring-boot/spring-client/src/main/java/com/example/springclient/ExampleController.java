package com.example.springclient;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/example")
public class ExampleController {

    @GetMapping("/message")
    @ResponseBody // view gelmesini engeller
    public String geMessage(){
        return "Örnek İletisi";
    }
}
