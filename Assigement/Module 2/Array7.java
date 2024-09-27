package com.Module;

import java.util.ArrayList;
import java.util.Collections;

public class Array7 
{
    public static void main(String[] args) 
    {
        
    	ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Elderberry");
        fruits.add("Date");

        System.out.println("ArrayList before sorting: " + fruits);

        Collections.sort(fruits);

        System.out.println("ArrayList after sorting: " + fruits);
    }
}
