package com.Module;

import java.util.HashSet;
import java.util.Iterator;

public class Array11 
{
    public static void main(String[] args) 
    {
        
    	HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");
        hashSet.add("Elderberry");

        System.out.println("Iterating using for-each loop:");
        for (String fruit : hashSet) 
        {
            System.out.println(fruit);
        }

        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
        }
    }
}