package Day5;

interface Drawable {
    public void draw();
}

interface Name{
    public void sayName(String name);
}

public class LambdaExpression {
    public static void main(String[] args) {
        int width = 10;

        Drawable d1 = () -> {
            System.out.println("this is a square of width: " + width);
        };
        d1.draw();

        Drawable d2 = () -> {
            System.out.println("this is a rectanle of width: " + width);
        };
        d2.draw();

        Name n1 = (String name) -> {
            System.out.println("Hello " + name);
        };

        n1.sayName("Pratham");
    }
}