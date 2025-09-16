package Interface;

interface AnimalEat {
    void eat();
}

interface AnimalTravel {
    void travel();
}

class Animal implements AnimalEat, AnimalTravel {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void travel() {
        System.out.println("Animal is travelling");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void travel() {
        System.out.println("Dog walks on 4 legs");
    }
}

public class demo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.travel();

        System.out.println();

        Animal d = new Dog();
        d.eat();
        d.travel();
    }
}