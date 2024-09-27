package com.Module;

import java.util.ArrayList;

public class Array2 
{
    public static void main(String[] args) 
    {
        
    	ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println("ArrayList before insertion: " + fruits);

        fruits.add(0, "Apple");

       System.out.println("ArrayList after inserting 'Apple' at the first position: " + fruits);
    }
}
