package Day7;

import Day7.Tool.Add;

public class Random {
    public static void showDetails(String name, int age) {
        System.out.println("Hello " + name + ", you are " + age + " years old!");
        System.out.println("The package is Day7");
    }

    public static void main(String[] args) {
        showDetails("Pratham", 19);
        int sum1 = Add.add(16, 14);
        int sum2 = Add.add(16, 16, 18);

        System.out.println(Add.add(sum1, sum2));

    }
}