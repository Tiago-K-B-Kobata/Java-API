package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.Pokemon;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

@Service
public class PokedexService {
    
    
    public static Pokemon getPoke(){
       
        
       String api = "https://pokeapi.co/api/v2/pokemon?limit=10";
       RestTemplate restTemplate = new RestTemplate();
       String apiResult = restTemplate.getForObject(api, String.class);
       JSONObject rawData = new JSONObject(apiResult);
       JSONArray midData = rawData.getJSONArray("results"); 
       
       JSONObject data = midData.getJSONObject(0);
       String name = data.getString("name");
       Pokemon poke = new Pokemon();
       poke.setName(name);
       
       return poke;
        
    }
}
