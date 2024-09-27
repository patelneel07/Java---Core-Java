package com.Module;

import java.util.ArrayList;

public class Array1
{
    public static void main(String[] args) 
    {
    
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        System.out.println("Using a for loop:");
        for (int i = 0; i < fruits.size(); i++) 
        {
            System.out.println(fruits.get(i));
        }
        System.out.println("\nUsing an enhanced for loop:");
        for (String fruit : fruits) 
        {
            System.out.println(fruit);
        }
        System.out.println("\nUsing Streams:");
        fruits.stream().forEach(System.out::println);
    }
}

