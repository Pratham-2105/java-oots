package Day5;

class C1 {
    void runC1() {
        System.out.println("This is from Class-C1");
    }
}

class C2 extends C1 {
    void runC2() {
        System.out.println("This is from Class-C2");
    }
}

/*
 * C2 extends C1
 * is SINGLE-Level Inheritance;
 */

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog is barking...");
    }
}

class subDog extends Dog {
    void running() {
        System.out.println("subDog is running... ");
    }
}

/*
 * Animal <- Dog <- subDog
 * is an example of MUTLI-LEVEL inheritance;
 */

class A {
    void msg() {
        System.out.println("This is from class A");
    }
}

class B {
    void msg() {
        System.out.println("This is from class B");
    }
}

/*
 * class C extends A,B{
 * 
 * void msg() {
 * System.out.println("This is from class C");
 * }
 * }
 * 
 * This is MULTIPLE inheritance(NOT-SUPPORTED)
 * In the main, the object won't know which msg() to call;
 */

interface MyInterface {
    void sayHello();
}

public class Inheritance {
    public static void main(String[] args) {
        C2 obj = new C2();
        obj.runC1();
        obj.runC2();

        subDog dog = new subDog();
        dog.eat();
        dog.sound();
        dog.running();

        MyInterface i1 = () -> System.out.println("hello world!");
        i1.sayHello();
    }
}