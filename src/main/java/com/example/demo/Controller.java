package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String example(){
        return "<p1><b>HELLLO WORLDSSSSSSSS From Prod Server !!!!!!!!<b></p1>";
    }
}
