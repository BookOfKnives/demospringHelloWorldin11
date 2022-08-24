package com.test00211.demospringhelloworldin11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class helloController {

    @RequestMapping("/1")
    public String hello() {
        System.out.println("hello from HEllo-class in helloController");
        return "first";
    }
}
