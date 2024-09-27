package com.Module;

import java.util.ArrayList;
import java.util.Scanner;

public class Array6 
{
    public static void main(String[] args) 
    {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        System.out.println("ArrayList: " + fruits);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element you want to search for: ");
        String searchElement = scanner.nextLine();

        if (fruits.contains(searchElement)) 
        {
            System.out.println(searchElement + " is found in the ArrayList.");
        }
        else 
        {
            System.out.println(searchElement + " is not found in the ArrayList.");
        }

        scanner.close();
    }
}
