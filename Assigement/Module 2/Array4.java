package com.Module;

import java.util.ArrayList;
import java.util.Scanner;

public class Array4 
{
    public static void main(String[] args) 
    {
       
    	ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        System.out.println("ArrayList before update: " + fruits);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the element you want to update (0 to " + (fruits.size() - 1) + "): ");
       
        int index = scanner.nextInt();

        if (index >= 0 && index < fruits.size()) 
        {
            System.out.print("Enter the new element: ");
            String newElement = scanner.next();
        
            fruits.set(index, newElement);
            System.out.println("ArrayList after update: " + fruits);
        }
        else 
        {
            System.out.println("Index out of bounds. Please enter a valid index.");
        }
        scanner.close();
    }
}
