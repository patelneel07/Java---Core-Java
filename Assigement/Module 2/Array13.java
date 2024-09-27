package com.Module;

import java.util.HashMap;

public class Array13 
{
    public static void main(String[] args) 
    {
        // Create a HashMap to associate keys with values
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("1", "Apple");
        hashMap.put("2", "Banana");
        hashMap.put("3", "Cherry");
        hashMap.put("4", "Date");

        System.out.println("HashMap contents: " + hashMap);
        
        String keyToUpdate = "2";
        String newValue = "Blueberry";
        hashMap.put(keyToUpdate, newValue);

        System.out.println("Updated HashMap after associating key '" + keyToUpdate + "' with value '" + newValue + "': " + hashMap);
    }
}
