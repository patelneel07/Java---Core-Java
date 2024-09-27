package com.Module;

import java.util.ArrayList;

public class Array16 
{
    public static void main(String[] args) 
    {
 
    	ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        System.out.println("Original ArrayList: " + list);

        int startIndex = 1; // Starting from "Banana"
        int endIndex = 4;   // Ending before "Elderberry"

        ArrayList<String> subList = new ArrayList<>(list.subList(startIndex, endIndex));

        System.out.println("Extracted portion: " + subList);
    }
}