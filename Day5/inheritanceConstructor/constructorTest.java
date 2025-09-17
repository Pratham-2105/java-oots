package Day5.inheritanceConstructor;

class Parent {
    int age = 0;

    Parent() {
        System.out.println("Contructor of Parent-Class");
    }

    Parent(int age) {
        System.out.println("Contructor of Parent-Class");
        this.age = age;
    }
}

class Child extends Parent {
    String name;

    Child() {
        System.out.println("Constructor of Child-Class");
    }

    Child(String name) {
        System.out.println("Constructor of Child-Class");
        this.name = name;
    }
}

class ChildChild extends Child {
    int age = 0;
    String name = null;

    ChildChild() {
        System.out.println("random child");
    }

    ChildChild(int age, String name) {
        System.out.println("random child");
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(this.age + " : " + this.name);

    }
}

public class constructorTest {
    public static void main(String[] args) {
        ChildChild cc = new ChildChild(19, "Pratham");
        cc.display();
    }
}