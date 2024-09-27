package com.Module;

import java.util.Scanner;

public class division
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        try 
        {
            System.out.print("Enter two numbers: ");
            int numerator = scanner.nextInt();
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

