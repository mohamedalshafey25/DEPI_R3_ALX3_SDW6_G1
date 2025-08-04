package org.example.FileHandling;

import java.io.*;
public class FilesDemo_Character {

    public static void main(String[] args) {

        // FileWriter
        String fileName = "MyNotes.txt";
        File file = new File(fileName);

        try (
        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            bufferedWriter.write("This is the first line of text.");
            bufferedWriter.newLine(); // Line separator
            bufferedWriter.write("Here is the second line.");
            bufferedWriter.newLine();
            bufferedWriter.write("And a final third line.");
            bufferedWriter.newLine();
            System.out.println("File written successfully: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("An error occurred during writing to the file: " + e.getMessage());
            System.err.println();

        }
        // FileReader
        try (
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader)
            ) {
            String line;
            while ( (line = bufferedReader.readLine() )!= null) {
                System.out.println(line);
            }

            System.out.println("\nSuccessfully read all data from the file.");

        } catch (IOException e) {
            System.out.println("An error occurred during reading from the file: " + e.getMessage());
        }

    }

}