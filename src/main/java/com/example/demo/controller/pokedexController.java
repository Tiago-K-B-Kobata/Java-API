package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.service.PokedexService;

@RestController
public class PokedexController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    
    @RequestMapping("/poke")
    public String poke(){
        return PokedexService.getPoke().getName();
    }
    
}
