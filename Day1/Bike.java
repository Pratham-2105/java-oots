package Day1;
abstract class Bike {
    abstract void run();
}

class Honda4 extends Bike { // sub-class of Bike -> Honda4;
    void run() {
        System.out.println("running safely");
    }

    public static void main(String[] args) {
        Bike obj = new Honda4();
        obj.run();
    }
}

class Honda5 extends Bike {
    void run() {
        System.out.println("not running safely!");
    }

    public static void main(String[] args) {
        Bike obj = new Honda5();
        obj.run();
    }
}
 