package org.example.handlingExceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemoCheckedException {
    public static void main(String[] args) throws FileNotFoundException {

    FileReader reader = null;

    File file = new File("non_existent_file.txt");
    reader = new FileReader(file); // This line will throw FileNotFoundException (a type of IOException)

    }

}
