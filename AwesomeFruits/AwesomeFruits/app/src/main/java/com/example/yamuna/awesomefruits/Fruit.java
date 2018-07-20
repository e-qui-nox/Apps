package com.example.yamuna.awesomefruits;

import java.util.ArrayList;

public class Fruit {

    private String fruitName;
    private int imageId;

    Fruit(String fruitName,int imageId){
        this.fruitName = fruitName;
        this.imageId = imageId;
    }

    public String getFruitName(){
        return this.fruitName;
    }
    public int getImageId(){
        return  this.imageId;
    }
}
