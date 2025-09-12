package Day1;
abstract class random {
    int sum(int a, int b) {
        System.out.println(a + b);
        return a + b;
    }
}

class actual extends random {
    void sub(int a, int b) {
        System.out.println(a - b);
    }

    public static void main(String args[]) {
        random obj = new actual();
        int add = obj.sum(5, 6);
        System.out.println(add);
    }
}

class alsoActual extends actual {
    public static void main(String[] args) {
        actual obj = new alsoActual();
        obj.sum(14, 15);
        obj.sub(15, 10);
    }
}

class actual1 extends actual {
    public static void main(String args[]) {
        System.out.println("Hello");
    }
}