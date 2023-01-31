package com.example.spring5recipeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/","/index"})
    public String getIndexPage(){
        System.out.println("ce se 223");
        return "index";
    }
}
