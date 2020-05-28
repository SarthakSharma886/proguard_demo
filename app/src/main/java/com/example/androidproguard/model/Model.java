package com.example.androidproguard.model;

public class Model {
    private String name ;
    private int id ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String sayHello(){
        return name+id;
    }
}

