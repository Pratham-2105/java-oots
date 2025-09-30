package Day12;

import java.io.*;

public class IOstreams {
    public static void main(String[] args) {
        String inputFile = "fileIN.txt";
        String outputFile = "fileOUT.txt";

        try (
                FileReader fr = new FileReader(inputFile);
                FileWriter fw = new FileWriter(outputFile, true);) 
            {

            fw.write("This portion is added at the top.\n");
            int c;

            while ((c = fr.read()) != -1) {
                fw.write(c);
            }

            fw.write("This portion is added at the end.\n");
            
            System.out.println("File copied successfully from "
                    + inputFile + " to " + outputFile);
        } 
        catch (Exception e) {
            System.out.println("Some error occured: " + e.getMessage());
        }

    }
}