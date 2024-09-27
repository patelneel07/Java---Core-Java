package com.Module;

import java.util.ArrayList;

public class Array5 
{
    public static void main(String[] args) 
    {
        
    	ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        System.out.println("ArrayList before removal: " + fruits);

        if (fruits.size() >= 3) 
        {

        	fruits.remove(2);
            System.out.println("ArrayList after removing the third element: " + fruits);
        } 
        else
        {
            System.out.println("ArrayList does not have enough elements to remove the third one.");
        }
    }
}
