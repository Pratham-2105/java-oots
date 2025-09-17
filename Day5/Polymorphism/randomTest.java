package Day5.Polymorphism;

class ABC {
    public void disp() {
        System.out.println("disp() is displaying...");
    }
}

class Demo extends ABC {
    public void disp() {
        System.out.println("disp() method of Child class");
    }

    public void newMethod() {
        System.out.println("new method of child class");
    }
}

public class randomTest {
    public static void main(String[] args) {
        ABC obj = new ABC();
        obj.disp();

        ABC obj2 = new Demo();
        obj2.disp();

        Demo obj3 = new Demo();
        obj3.newMethod();
        obj3.disp();
    }
}
