package Day9;

public class StringBuilders {
    public static void main(String[] args) {
        String input = "William";
        String firstTwo = input.substring(0, 2);
        int n = input.length();

        StringBuffer answer = new StringBuffer();

        for (int i = 0; i < n; i++) {
            answer.append(firstTwo);
        }

        System.out.println(answer);
    }
}
