package com.Module;

class Shape 
{
    void printShape() 
    {
        System.out.println("This is a shape.");
    }
}
class Rectangle extends Shape {
    void printShape() {
        System.out.println("This is a rectangular shape.");
    }
}

// Circle.java
class Circle extends Shape {
    void printShape() {
        System.out.println("This is a circular shape.");
    }
}

class Square extends Rectangle {
    void printSquare() {
        System.out.println("Square is a rectangle.");
    }
}

public class shape
{
    public static void main(String[] args) 
    {
        Square square = new Square();
        
        
        square.printShape(); 
        square.printSquare(); 
        
        ((Shape)square).printShape(); 
    }
}

