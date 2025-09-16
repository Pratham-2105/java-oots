/*
    1. Java Program to create a class, methods and invoke them inside main method.

    2. Write a Java program to illustrate the abstract class concept. Create an abstract class Shape, 
        which contains an empty method numberOfSides().
        Define three classes named Trapezoid, Triangle and Hexagon extends the class Shape, 
        such that each one of the classes contains only the method numberOfSides(), that contains the number of 
        sides in the given geometrical figure. Write a class Abstract Example with the main() method, declare an 
        object to the class Shape, create instances of each class and call numberOfSides() methods of
        each class.
        
    3. Write a Java Program to find the Factorial of a given number. 
*/

package Assignments;

abstract class Shape {
    abstract void numberOfSides();
}

class Trapezoid extends Shape {
    void numberOfSides() {
        System.out.println("Trapezoid has 4 sides");
    }
}

class Triangle extends Shape {
    void numberOfSides() {
        System.out.println("Triangle has 3 sides");
    }
}

class Hexagon extends Shape {
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides");
    }
}

class forFactorial {

    int sum = 1;

    public void calculateFactorial(int num) {
        if (num == 1)
            System.out.println(1);
        for (int i = 2; i <= num; i++) {
            sum *= i;
        }
        System.out.println("Factorial of " + num + ": " + sum);
    }
}

public class assignment2 {
    public static void main(String[] args) {
        
        
        Trapezoid trap = new Trapezoid();
        Triangle tri = new Triangle();
        Hexagon hex = new Hexagon();

        trap.numberOfSides();
        tri.numberOfSides();
        hex.numberOfSides();


        forFactorial fact = new forFactorial();
        fact.calculateFactorial(4);
    }
}