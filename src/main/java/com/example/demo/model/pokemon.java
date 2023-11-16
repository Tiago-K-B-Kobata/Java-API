package com.example.demo.model;

import java.util.ArrayList;

public class Pokemon {
    
    private int               dex;
    private String            name;
    private ArrayList<String> types;
    private Number            height;
    private Number            weight;
    
    
    public Pokemon(){
       
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public Number getHeight() {
        return height;
    }

    public void setHeight(Number height) {
        this.height = height;
    }

    public Number getWeight() {
        return weight;
    }

    public void setWeight(Number weight) {
        this.weight = weight;
    }

    public ArrayList<String> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<String> types) {
        this.types = types;
    }
    
    
}

 
