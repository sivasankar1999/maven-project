package com.epam.maven_project;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class App 
{
    public static void main( String[] args )
    {
     
     // List of objects of the sweet class 
        List<Sweets> gift = new ArrayList<>();
        //Runtime polymorphism
        gift.add(new chocolates("MilkyBar","100%", 3,15));
        gift.add(new candy("Snickers","40%", 7,10));
        gift.add(new candy("venella","10%", 4,20));
        gift.add(new jellyBeans("Apple","45%",4,3));
        gift.add(new candy("Lime","92%",5,7));
        gift.add(new candy("Orange","72%",5,3));
        List<Sweets> chocolate=new ArrayList<>();
        for(int i=0;i<gift.size();i++){
            if(gift.get(i) instanceof chocolates){
                chocolate.add(gift.get(i));
            }
        }
        
        System.out.println("Chocolates sorting by their weights");
        Collections.sort(chocolate,new Sortbyweigth());		//sorted based on the weights of chocolates
        for(int i=0;i<chocolate.size();i++){
            chocolate.get(i);
			System.out.println(chocolate.get(i).name+" choco% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).price+" weight of chocolate is "+Sweets.weigth+"gms");
        }
        System.out.println();
        System.out.println("Chocolates sorted by their cost");	//sorting based on the cost of chocolates
        Collections.sort(chocolate,new Sortbycost());
        for(int i=0;i<chocolate.size();i++){
        	System.out.println(chocolate.get(i).name+" choco% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).price+" weight of chocolate is "+chocolate.get(i).weight+"gms");
        }
        System.out.println();
        Collections.sort(chocolate,new Sortbytype());  //sorted based on the type of content
        System.out.println("Chocolates sorting by their content %");
        for(int i=0;i<chocolate.size();i++){
        	System.out.println(chocolate.get(i).name+" choco% is "+chocolate.get(i).type+" cost is "+chocolate.get(i).price+" weigth of chocolate is "+chocolate.get(i).weight+"gms");
        }
        //total weight
        int net_weight=0;
        for(int i=0;i<gift.size();i++){
            net_weight+=gift.get(i).weight;
        }
        System.out.println();
        System.out.println("Total weight of gift "+net_weight+"gm");
        //Calculating total no of candy
        int count_candies=0;
        for(int i=0;i<gift.size();i++){
            if(gift.get(i) instanceof candy){
                count_candies++;
            }
        }
        System.out.println();
        System.out.println("No of Candies is "+count_candies);
        //candies between range of the cost in between 2 to 5
        System.out.println("");
        System.out.println("candies between range of the cost in between 2 to 5\n");
        for(int i=0;i<gift.size();i++){
            if(gift.get(i) instanceof candy){
                if(gift.get(i).price<=5 && gift.get(i).price>=2) {
                	gift.get(i);
					System.out.println(gift.get(i).name+" Sugar% is "+gift.get(i).type+" cost is "+gift.get(i).price+" weight of Candy is "+Sweets.weigth+"gms");
                }
            }
        }
      //candies between range of the cost in between 2 to 5
        System.out.println("");
        System.out.println("candies between range of the weigth in between 2 to 9\n");
        for(int i=0;i<gift.size();i++){
            if(gift.get(i) instanceof candy){
                if(gift.get(i).weight <=5 && gift.get(i).weight>=2) {
                	System.out.println(gift.get(i).name+" Sugar% is "+gift.get(i).type+" cost is "+gift.get(i).price+" weight of candy is "+gift.get(i).weight+"gms");
                }
            }
        }
        
    }
}