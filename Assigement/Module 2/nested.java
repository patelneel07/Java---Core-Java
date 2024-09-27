package com.Module;

public class nested 
{
    public static void main(String[] args) 
    {
        try 
        {
            int[] numbers = {10, 0, 5};
            for (int i = 0; i < numbers.length; i++) 
            {
                try 
                {
                	System.out.println("Division Result: " + (numbers[0] / numbers[i]));
                } catch (ArithmeticException e) 
                {
                    System.out.println("Caught an ArithmeticException: Cannot divide by zero.");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: Index is out of bounds.");
        } catch (Exception e) 
        {
            System.out.println("Caught a generic Exception: " + e.getMessage());
        } finally 
        {
            System.out.println("Execution completed.");
        }
    }
}
