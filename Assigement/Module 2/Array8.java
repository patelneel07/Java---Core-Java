package com.Module;

import java.util.ArrayList;

public class Array8 
{
    public static void main(String[] args) 
    {

        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");

        System.out.println("Original ArrayList: " + originalList);

        ArrayList<String> copiedList = new ArrayList<>(originalList);

        System.out.println("Copied ArrayList: " + copiedList);
    }
}