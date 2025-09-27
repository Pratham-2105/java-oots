class Animal {
    public void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Question5 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Dog d1 = new Dog();
        a1.sound();
        d1.sound();
    }
}