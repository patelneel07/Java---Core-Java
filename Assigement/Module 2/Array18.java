package com.Module;

import java.util.ArrayList;

public class Array18 
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

        int index1 = 1; // Index of "Banana"
        int index2 = 3; // Index of "Date"

        swapElements(list, index1, index2);

        System.out.println("ArrayList after swapping: " + list);
    }

    private static void swapElements(ArrayList<String> list, int index1, int index2) {
        String temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}