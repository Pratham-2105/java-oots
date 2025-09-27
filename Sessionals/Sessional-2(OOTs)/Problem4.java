public class Problem4 {
    public static void main(String[] args) {
        String test = "JavA ProgRaMMing";
        String forConcat = "Concatenated";

        String sub = test.substring(0, 7);
        String con = test.concat(forConcat);
        int length = test.length();

        String forEquals = "Concatenated";
        boolean checkEqual = forConcat.equals(forEquals);

        boolean forContains = test.contains("P");

        System.out.println("This is the substring: " + sub);
        System.out.println("This is the concatenated string: " + con);
        System.out.println("The length of the string is: " + length);

        System.out.println();
        System.out.println("String 1: " + forConcat + " String 2: " + forEquals);
        if (checkEqual)
            System.out.println("Strings are equal.");
        else
            System.out.println("String are not equal.");

        System.out.println();
        System.out.println("String to check for (P): " + test);
        if (forContains)
            System.out.println("The string contains (P)");
        else
            System.out.println("The string does not contain (P)");
    }
}
