package com.Module;

abstract class Marks 
{
    abstract double getPercentage();
}

class StudentA extends Marks 
{
    private double marks1, marks2, marks3;

    public StudentA(double marks1, double marks2, double marks3) 
    {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    @Override
    double getPercentage() 
    {
        double totalMarks = marks1 + marks2 + marks3;
        return (totalMarks / 300) * 100; 
    }
}

class StudentB extends Marks 
{
    private double marks1, marks2, marks3, marks4;

    public StudentB(double marks1, double marks2, double marks3, double marks4) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.marks4 = marks4;
    }

    @Override
    double getPercentage() 
    {
        double totalMarks = marks1 + marks2 + marks3 + marks4;
        return (totalMarks / 400) * 100; 
    }
}

public class percentage
{
    public static void main(String[] args) 
    {
        Marks studentA = new StudentA(85, 90, 78); 
        Marks studentB = new StudentB(88, 92, 80, 75); 

        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}