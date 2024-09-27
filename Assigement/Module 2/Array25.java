package com.Module;

import java.util.ArrayList;

public class Array25 
{
    public static void main(String[] args) 
    {
        
    	ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Elderberry");

        System.out.println("Elements in the ArrayList:");
        for (int i = 0; i < arrayList.size(); i++) 
        {
            System.out.println("Element at position " + i + ": " + arrayList.get(i));
        }
    }
}