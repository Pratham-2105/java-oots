abstract class Animal {
    abstract void sound();
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Question3 {
    public static void main(String[] args) {
        Animal obj1 = new Cat();
        obj1.sound();
    }
}
