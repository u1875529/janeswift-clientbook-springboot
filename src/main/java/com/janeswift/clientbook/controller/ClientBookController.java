package com.janeswift.clientbook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ResponseBody
@RestController
public class ClientBookController {
    @GetMapping ("/")
    public String testMapping (){
        return "Hello, World";
    }
}
