package com.epam.maven_project;

import com.epam.maven_project.Sweets;

public class jellyBeans extends Sweets{
    //inheritance
    String name,type;
    int weight,price;
    jellyBeans(String name,String type,int price,int weigth){
        super(name,type,price,weigth);
    }
}