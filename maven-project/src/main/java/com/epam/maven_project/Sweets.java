package com.epam.maven_project;

import java.util.*; 
class Sweets{
    public static String weigth;
	String name,type;
    int weight,price;
    Sweets(String name,String type,int price,int weight){
        this.name=name;
        this.type=type;
        this.price=price;
        this.weight=weight;
    }
}
// sort by using the weight of the sweets
class Sortbyweigth implements Comparator<Sweets> { 
    public int compare(Sweets a, Sweets b){ 
        return a.weight - b.weight; 
    } 
}
//sort by using the cost of the sweets
class Sortbycost implements Comparator<Sweets> { 
    public int compare(Sweets a, Sweets b){ 
        return a.price - b.price; 
    } 
}
// sort by using the type of sweets
class Sortbytype implements Comparator<Sweets> { 
    public int compare(Sweets a, Sweets b){ 
        return a.type.compareTo(b.type); 
    } 
}