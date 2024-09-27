package com.Module;

import java.util.HashMap;
import java.util.Map;

public class Array14 
{
    public static void main(String[] args) 
    {
        
    	Map<String, String> map = new HashMap<>();

        map.put("name", "Alice");
        map.put("age", "30");
        map.put("city", "New York");

        int size = map.size();

        System.out.println("Number of key-value mappings in the map: " + size);
        
        System.out.println("HashMap content: " + map);
    }
}
