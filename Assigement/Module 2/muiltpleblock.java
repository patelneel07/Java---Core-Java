package com.Module;

public class muiltpleblock 
{
    public static void main(String[] args) 
    {
        int[] a = new int[5];

        try 
        {
        
            a[5] = 30 / 0; 
        } catch (ArithmeticException e) 
        {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Error: Array index is out of bounds.");
        } catch (Exception e) 
        {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}