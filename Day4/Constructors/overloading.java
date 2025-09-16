package Constructors;

class Student5 {
    int id;
    String name;
    int age;

    Student5(int i, String n) {
        id = i;
        name = n;
    }

    Student5(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + id + " " + age);
    }
}

public class overloading {
    public static void main(String[] args) {
        Student5 s1 = new Student5(101, "Person1");
        Student5 s2 = new Student5(1020, "Person2", 19);

        s1.display();
        s2.display();

    }
}