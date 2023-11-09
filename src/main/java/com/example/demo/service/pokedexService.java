package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.Pokemon;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

@Service
public class PokedexService {
    
    public static Pokemon getPoke(){
       Pokemon poke = new Pokemon();
       
       String uri = "https://pokeapi.co/api/v2/pokemon?limit=1";
       RestTemplate restTemplate = new RestTemplate();
       String apiResult = restTemplate.getForObject(uri, String.class);
       JSONObject rawData = new JSONObject(apiResult);
       JSONObject data = rawData.getJSONObject("results");
       String name = data.getString("name");
       
       poke.setName(name);
       
       return poke;
    }
}
