package Day5;


// Parent class
class Animal {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the sound() method of parent class
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another Child class
class Cat extends Animal {
    // Overriding the sound() method of parent class
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal a1 = new Animal();  // Reference of parent
        Animal a2 = new Dog();     // Reference of parent but object of child
        Animal a3 = new Cat();     // Reference of parent but object of child

        // Calls depend on actual object (Runtime Polymorphism)
        a1.sound();  // Animal's method
        a2.sound();  // Dog's method
        a3.sound();  // Cat's method
    }
}