package Day3;

class Inheritance {
    int counter = 0; // instance variable;

    public void showCounter() {
        System.out.println(counter);
    }
}

public class demo {
    public static void main(String args[]) {
        Inheritance inh = new Inheritance();
        for (int i = 0; i < 10; i++) {
            ++inh.counter;
            inh.showCounter();
        }

        System.out.println("After Loop: " + inh.counter);

        Inheritance inh1 = new Inheritance();

        for (int i = 0; i < 6; i++) {
            ++inh1.counter;
            inh1.showCounter();
        }
        System.out.println("New Object Counter: " + inh1.counter);

        Inheritance inh2 = new Inheritance();
        System.out.print("New Counter: ");
        inh2.showCounter();
    }
}