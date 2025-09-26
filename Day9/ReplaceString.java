package Day9;

public class ReplaceString {
    public static void main(String[] args) {
        String str1 = "Something is written here.";
        System.out.println("Original String: " + str1);

        String repString = str1.replace('t', 'T');
        System.out.println("Replaced String: " + repString);

    }
}
