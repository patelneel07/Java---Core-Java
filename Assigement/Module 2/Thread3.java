package com.Module;

class ThreadOne extends Thread
{
    @Override
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Thread One - Count: " + i);
            try 
            {   
                Thread.sleep(2000);
            } catch (InterruptedException e) 
            {
                System.out.println("Thread One was interrupted.");
            }
        }
    }
}

class ThreadTwo extends Thread 
{
    @Override
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Thread Two - Count: " + i);
            try 
            {
             Thread.sleep(2000);
            } catch (InterruptedException e) 
            {
                System.out.println("Thread Two was interrupted.");
            }
        }
    }
}

public class Thread3
{
    public static void main(String[] args) 
    {
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();
        threadOne.start();
        threadTwo.start();
        try 
        {
            threadOne.join();
            threadTwo.join();
        } catch (InterruptedException e) 
        {
            System.out.println("Main thread was interrupted.");
        }

        System.out.println("Both threads have completed execution.");
    }
}

