package Day9;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        String input = "This is for test";
        int vCount = 0;
        int cCount = 0;
        
        input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vCount += 1;
                else
                    cCount += 1;
            }
        }

        System.out.println("The number of characters are: " + input.length());
        System.out.println("The number of vowels is: " + vCount);
        System.out.println("The number of consonants is: " + cCount);
        System.out.println("The number of spaces are: " + (input.length() - (cCount + vCount)));
    }
}
