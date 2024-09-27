package com.Module;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
               
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }
}

public class Thread2 
{
    public static void main(String[] args) 
    {
        MyThread myThread = new MyThread();

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

