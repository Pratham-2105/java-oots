class Car {
    String model;
    int speed;

    public void display() {
        System.out.println("The mode of the car is: " + model + " with speed: " + speed);
    }
}

public class Question1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "Honda";
        c1.speed = 45;

        Car c2 = new Car();
        c2.model = "Maruti";
        c2.speed = 55;

        c1.display();
        c2.display();
    }
}