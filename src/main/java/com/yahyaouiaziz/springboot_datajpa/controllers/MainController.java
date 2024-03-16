package com.yahyaouiaziz.springboot_datajpa.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MainController {
    @GetMapping("/home")
    public String fetchAllProducts(){
        return "this is Home page form docker ";
    }

    @GetMapping("/login")
    public String fetchProductsById(){
        return "this is a login page";
    }
}
