package com.Module;

import java.util.Scanner;

public class block 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        try 
        {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();
            
            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();
            
            int result = numerator / denominator;
            System.out.println("Result: " + result);
            
        }
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Cannot divide by zero.");
        }
        catch (Exception e) 
        {
            System.out.println("Error: Invalid input.");
        }
        finally 
        {
            scanner.close();
        }
    }
}
