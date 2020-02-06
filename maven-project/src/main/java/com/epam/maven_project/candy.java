package com.epam.maven_project;

import com.epam.maven_project.Sweets;

public class candy extends Sweets{
    //inheritance
    String name,type;
    int price,weight;
    
    candy(String name,String type,int price,int weigth){
        super(name,type,price,weigth);
    }
}