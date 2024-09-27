package com.Module;

import java.util.HashMap;
import java.util.Map;

public class Array22 
{
    public static void main(String[] args) 
    {
 
    	Map<String, String> map = new HashMap<>();

        if (map.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map contains key-value mappings.");
        }

        map.put("Key1", "Value1");

        if (map.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map contains key-value mappings.");
        }
    }
}