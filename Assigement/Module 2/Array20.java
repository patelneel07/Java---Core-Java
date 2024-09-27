package com.Module;

import java.util.HashSet;

public class Array20 
{
    public static void main(String[] args) 
    {
 
    	HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        
        String[] array = hashSet.toArray(new String[0]);
        
        System.out.println("Elements in the array:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}