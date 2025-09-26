package Day8;

public class Assertions {
    public static void main(String[] args) {
        int age = 1;
        /*
         * if age !>= 18 automatically means that age is not
         * eligible vote;
         */

        if (age >= 18) {
            assert age >= 18 : "Age is less than 18, not eligible to vote!";
            System.out.println("Eligibe to vote.");
        } else {
            assert age >= 18 : "Age is less than 18, not eligible to vote!";
            System.out.println("Age is " + age + " eligible to vote.");
        }
    }
}
