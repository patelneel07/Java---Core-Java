package com.Module;

import java.util.ArrayList;

public class Array23 
{
    public static void main(String[] args) 
    {
 
    	ArrayList<String> arrayList = new ArrayList<>(); 

        System.out.println("Initial size: " + arrayList.size());

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("Current size after adding elements: " + arrayList.size());
        System.out.println("Elements: " + arrayList);

        arrayList.add("Date");
        arrayList.add("Elderberry");
        arrayList.add("Fig");

        System.out.println("New size after adding more elements: " + arrayList.size());
        System.out.println("Elements: " + arrayList);
    }
}