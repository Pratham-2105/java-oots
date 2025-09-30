package Day12;

import java.io.*;

public class forTwoFiles {
    public static void main(String[] args) {

        String inputFile1 = "f1.txt";
        String inputFile2 = "f2.txt";
        String outputFile = "f1_f2.txt";

        try (
                FileReader fr1 = new FileReader(inputFile1);
                FileReader fr2 = new FileReader(inputFile2);
                FileWriter fw = new FileWriter(outputFile);) {
            int c1;

            while ((c1 = fr1.read()) != -1) {
                fw.write(c1);
            }
            fw.write("\n");

            while ((c1 = fr2.read()) != -1) {
                fw.write(c1);
            }

            fw.write("\nThe contents of file1 and file2 have been added...\n");
            System.out.println("\nFile copied successfully.\n");
        } catch (Exception e) {
            System.out.println("Some error occured: " + e.getMessage());
        }

        try (FileReader fr = new FileReader(outputFile);) {
            int countChars = 0;
            int c1;

            while ((c1 = fr.read()) != -1) {
                if (c1 != '\n' && c1 != '\r') { // ignore newline chars
                    countChars++;
                }
            }
            System.out.println("The total words in the " + outputFile + " are: " + countChars);
        } catch (Exception e) {
            System.out.println("Something went wrong during counting " + e.getMessage());
        }
    }
}
