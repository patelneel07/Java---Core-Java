package com.Module;

public class catchblock 
{
    public static void main(String[] args)
    {
        
        if (args.length < 2) 
        {
            System.out.println("Please provide two numbers as command-line arguments.");
            return;
        }

        try 
        {    
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) 
        {
            System.out.println("Error: Cannot divide by zero.");
        } catch (NumberFormatException e) 
        {
            System.out.println("Error: Please provide valid integers.");
        } catch (Exception e) 
        {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally 
        {
            System.out.println("Execution completed.");
        }
    }
}
