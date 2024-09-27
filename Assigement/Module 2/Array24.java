 package com.Module;

import java.util.ArrayList;

public class Array24 
{
    public static void main(String[] args) 
    {
        
    	ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");

        System.out.println("Original ArrayList: " + arrayList);

        if (arrayList.size() >= 2) 
        {
            arrayList.set(1, "Blueberry");
        }
        else 
        {
            System.out.println("The ArrayList does not have enough elements.");
        }

        System.out.println("Updated ArrayList: " + arrayList);
    }
}