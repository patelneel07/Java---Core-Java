package com.Module;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Array21 
{
    public static void main(String[] args) 
    {

    	HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        List<String> arrayList = new ArrayList<>(hashSet);
        
        System.out.println("Elements in the ArrayList:");
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}
