package Assignments;

import java.io.*;
import java.util.*;

// 75. Count frequency of each word in a text file
class WordFrequencyCounter {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java WordFrequencyCounter <inputFile>");
            return;
        }

        String inputFile = args[0];
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

            System.out.println("Word Frequencies:");
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

// 76. Add line numbers to each line of a text file
class LineNumberAdder {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java LineNumberAdder <inputFile> <outputFile>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
                PrintWriter pw = new PrintWriter(new FileWriter(outputFile))) {

            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {
                pw.println(lineNumber + ": " + line);
                lineNumber++;
            }

            System.out.println("File with line numbers created: " + outputFile);

        } catch (IOException e) {
            System.out.println("Error processing file: " + e.getMessage());
        }
    }
}

// 77. Compare two binary files byte by byte
class BinaryFileComparator {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java BinaryFileComparator <file1> <file2>");
            return;
        }

        String file1 = args[0];
        String file2 = args[1];

        try (InputStream is1 = new FileInputStream(file1);
                InputStream is2 = new FileInputStream(file2)) {

            int byte1, byte2;
            int position = 0;
            boolean areSame = true;

            while ((byte1 = is1.read()) != -1 && (byte2 = is2.read()) != -1) {
                if (byte1 != byte2) {
                    areSame = false;
                    System.out.println("Files differ at byte position: " + position);
                    break;
                }
                position++;
            }

            if (areSame && is1.read() == -1 && is2.read() == -1) {
                System.out.println("Files are identical.");
            } else if (areSame) {
                System.out.println("Files differ in length.");
            }

        } catch (IOException e) {
            System.out.println("Error comparing files: " + e.getMessage());
        }
    }
}

public class assignment11 {

}