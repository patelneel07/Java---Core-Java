package com.Module;

import java.util.HashSet;

public class Array10 
{
    public static void main(String[] args) 
    {
        
    	HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        System.out.println("Original HashSet: " + hashSet);

        String newElement = "Date";
        hashSet.add(newElement);

        System.out.println("Updated HashSet after adding '" + newElement + "': " + hashSet);
    }
}
