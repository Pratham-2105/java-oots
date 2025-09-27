class Vehicle {
    public void fuelType() {
        System.out.println("Vehicle uses fuel");
    }
}

class Car extends Vehicle {
    public void numberOfWheels() {
        System.out.println("Car has 4 wheels");
    }
}

public class Question4 {
    public static void main(String[] args) {
        Car v1 = new Car();
        v1.fuelType();
        v1.numberOfWheels();
    }
}