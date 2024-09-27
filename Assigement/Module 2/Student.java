package com.Module;

class AgeNotWithinRangeException extends Exception 
{
    public AgeNotWithinRangeException(String message) 
    {
        super(message);
    }
}

class NameNotValidException extends Exception 
{
    public NameNotValidException(String message) 
    {
        super(message);
    }
}

class student 
{
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) 
            throws AgeNotWithinRangeException, NameNotValidException 
    {
        if (age < 15 || age > 21) 
        {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21.");
        }
        if (!isValidName(name))
        {
            throw new NameNotValidException("Name cannot contain numbers or special symbols.");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    
    private boolean isValidName(String name)
    {
        return name.matches("[a-zA-Z ]+"); 
    }

    public void display() 
    {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
public class Student
{
    public static void main(String[] args) 
    {
        try 
        {
            Student student1 = new Student(1, "Alice", 20, "Computer Science");
            student1.display();

            Student student2 = new Student(2, "Bob", 22, "Mathematics");
        } catch (AgeNotWithinRangeException | NameNotValidException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
        try 
        {
            Student student3 = new Student(3, "Charlie123", 19, "Physics");
        } catch (AgeNotWithinRangeException | NameNotValidException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
