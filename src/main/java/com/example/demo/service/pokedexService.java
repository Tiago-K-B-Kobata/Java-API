package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.model.Pokemon;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;

@Service
public class PokedexService {
    
    
    public static ArrayList<Pokemon> getPoke(){
       
       ArrayList<Pokemon> pokedex = new ArrayList<>();
       
       String api = "https://pokeapi.co/api/v2/pokemon?limit=151";
       RestTemplate restTemplate = new RestTemplate();
       String apiResult = restTemplate.getForObject(api, String.class);
       JSONObject rawData = new JSONObject(apiResult);
       JSONArray midData = rawData.getJSONArray("results"); 
       
       for (int i = 0; i < midData.length(); i++) {
           
        ArrayList<String> types = new ArrayList<>();
           
        JSONObject data = midData.getJSONObject(i);
        String url = data.getString("url");
        String rawInfoPoke = restTemplate.getForObject(url, String.class);
        JSONObject jsonInfoPoke = new JSONObject(rawInfoPoke);
        JSONArray midnfoDex = jsonInfoPoke.getJSONArray("game_indices");
        JSONObject infoDex = midnfoDex.getJSONObject(9);
        JSONArray midInfoTypes = jsonInfoPoke.getJSONArray("types");
           for (int j = 0; j < midInfoTypes.length(); j++) {
               JSONObject infoType = midInfoTypes.getJSONObject(j);
               JSONObject infoSlot = infoType.getJSONObject("type");
               
               types.add(infoSlot.getString("name"));
           }
       
        String name = jsonInfoPoke.getString("name");
        Number height = jsonInfoPoke.getInt("height");
        Number weight = jsonInfoPoke.getInt("weight");
        int dex = infoDex.getInt("game_index");
       
        Pokemon poke = new Pokemon();
        poke.setName(name);
        poke.setDex(dex);
        poke.setHeight(height);
        poke.setWeight(weight);
        poke.setTypes(types);
       
        pokedex.add(poke);
       }
       
       return pokedex;
        
    }

}
