import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question1 {
    public static void main(String[] args) {
        int lines = 0, words = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("sample.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
                String[] parts = line.trim().split("\\s+");
                if (!line.trim().isEmpty())
                    words += parts.length;
            }
            System.out.println("Total Lines: " + lines);
            System.out.println("Total Words: " + words);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("\nDifference: BufferedReader buffers data for efficiency, "
                + "while FileReader reads character by character (slower).");
    }
}