package com.example.demo.model;

public class Pokemon {
    
    private int      dex;
    private String   name;
    private String[] types;
    private Number   height;
    private Number   weight;
    
    
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
}

 
