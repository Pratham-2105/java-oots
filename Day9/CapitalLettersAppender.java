package Day9;

public class CapitalLettersAppender {
    public static void main(String[] args) {
        String input = "JaVa ProGram To Find CAPital Letters";
        String check1 = "tHIS Is IN capital";
        StringBuilder capitals = new StringBuilder();

        for (int i = 0; i < check1.length(); i++) {
            char ch = check1.charAt(i);

            if (Character.isUpperCase(ch) || Character.isWhitespace(ch)) {
                capitals.append(ch);
            }
        }

        // Print result
        System.out.println("Input String: " + check1);
        System.out.println("Capital Letters: " + capitals.toString());
    }
}