package com.Module;

import java.util.ArrayList;

public class Array19 
{
    public static void main(String[] args) 
    {
 
    	ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Date");
        list2.add("Elderberry");
        list2.add("Fig");

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        ArrayList<String> combinedList = new ArrayList<>(list1);
        combinedList.addAll(list2);

        System.out.println("Combined List: " + combinedList);
    }
}