package com.epam.maven_project;

public class chocolates extends Sweets{
    //inheritance
    String name,type;
    int weight,price;
    chocolates(String name,String type,int price,int weight){
        super(name,type,price,weight);
    }
}