package com.Module;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Array27 
{
    public static void main(String[] args) 
    {
 
    	Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);
        map.put("Date", 40);

        System.out.println("Original Map: " + map);

        Collection<Integer> values = map.values();

        System.out.println("Collection view of values: " + values);
    }
}