package com.Module;

class MyRunnable implements Runnable 
{
    @Override
    public void run() 
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Thread is running: " + i);
            try 
            {
               
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }
}

public class Thread1
{
    public static void main(String[] args) 
    {
    	MyRunnable myRunnable = new MyRunnable();
    	Thread myThread = new Thread(myRunnable);
        myThread.start();
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println("Main thread is running: " + i);
            try 
            {
                Thread.sleep(800);
            } catch (InterruptedException e) 
            {
                System.out.println("Main thread was interrupted.");
            }
        }
    }
}


