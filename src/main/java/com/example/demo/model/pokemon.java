package com.example.demo.model;

public class pokemon {
    
    private int      dex;
    private String   name;
    private String[] types;
    private Number   height;
    private Number   weight;
    
    public pokemon(int dex, String name, Number height, Number weight){
        this.dex  =   dex;
        this.name =   name;
        this.height = height;
        this.weight = weight;
    }
}
