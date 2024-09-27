package com.Module;

import java.util.HashSet;

public class Array12 
{
    public static void main(String[] args) 
    {
        
    	HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");
        hashSet.add("Elderberry");

        int size = hashSet.size();

        System.out.println("The number of elements in the HashSet: " + size);
    }
}