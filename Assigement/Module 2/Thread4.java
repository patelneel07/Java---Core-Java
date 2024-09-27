package com.Module;

class TestThreadTwice1 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
        try {
            
            Thread.sleep(2000);
        } catch (InterruptedException e)
        {
            System.out.println("Thread was interrupted.");
        }
    }
}

public class Thread4 
{
    public static void main(String[] args) 
    {
        TestThreadTwice1 t1 = new TestThreadTwice1();
        t1.start();
        try 
        {
           t1.join();
        } catch (InterruptedException e) 
        {
            System.out.println("Main thread was interrupted.");
        }

        try 
        {
            t1.start(); 
        } catch (IllegalThreadStateException e) 
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
