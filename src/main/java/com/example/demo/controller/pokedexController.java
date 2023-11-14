package com.example.demo.controller;

import com.example.demo.model.Pokemon;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.service.PokedexService;
import java.util.ArrayList;

@RestController
public class PokedexController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    
    @RequestMapping("/poke")
    public ArrayList<Pokemon> poke(){
        return PokedexService.getPoke();
    }
    
}
