package com.Module;

import java.util.ArrayList;

public class Array17 
{
    public static void main(String[] args) 
    {
 
    	ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Cherry");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Banana");
        list2.add("Cherry");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Date");
        list3.add("Elderberry");

        boolean areEqual1 = list1.equals(list2);
        boolean areEqual2 = list1.equals(list3);

        System.out.println("List1 and List2 are equal: " + areEqual1);
        System.out.println("List1 and List3 are equal: " + areEqual2);
    }
}