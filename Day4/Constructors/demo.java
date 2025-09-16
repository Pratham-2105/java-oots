package Constructors;

class Geek {
    int num;
    String name;

    Geek() { // -> default constructor;
    } // -> no argument passing constructor;
}

class Student4 {
    int id;
    String name;

    Student4(int i, String n) { // -> parameterized construtor;
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class demo {
    public static void main(String[] args) {
        Geek geek1 = new Geek();
        geek1.name = "Pratham Srivastava";
        geek1.num = 19;

        System.out.println(geek1.name + " " + geek1.num);

        Student4 stud0 = new Student4(100, "Person1");
        Student4 stud1 = new Student4(101, "Person2");

        stud0.display();
        stud1.display();
    }
}