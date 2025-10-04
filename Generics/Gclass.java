package Generics;

class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    public void printValueAndType() {
        System.out.println("Value: " + value);
        String typeName = (value == null) ? "null" : value.getClass().getName();
        System.out.println("Type: " + typeName);
    }
}

public class Gclass {
    public static void main(String[] args) {

        Box<Integer> intBox = new Box<>(100);
        Box<String>  strBox = new Box<>("Hello Generics");
        Box<Double>  dblBox = new Box<>(45.67);

        intBox.printValueAndType();
        strBox.printValueAndType();
        dblBox.printValueAndType();

        intBox.set(200);
        System.out.println("Updated Integer Value: " + intBox.get());
    }
}
