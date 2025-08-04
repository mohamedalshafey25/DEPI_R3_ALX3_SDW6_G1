package org.example.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesDemo_Byte {
    public static void main(String[] args) throws IOException {

        File originalCat = new File("Cat.jpg"); // File object representing the original image file
        FileInputStream inputStream = new FileInputStream(originalCat); // FileInputStream is used to read bytes from a file
        byte[] originalCatBytes = new byte[(int) originalCat.length()];
        inputStream.read(originalCatBytes);
        System.out.println("Image byte code read successfully from: " + originalCat.getAbsolutePath());
        inputStream.close();


        //writing image byte code to a new file
        File copiedCat = new File("CopyCat.jpg"); // File object representing the new image file
        FileOutputStream outputStream = new FileOutputStream(copiedCat); // FileOutputStream is used to write bytes to a file
        outputStream.write(originalCatBytes); // Writing the byte array to the new file
        outputStream.close(); // closing the output stream

        System.out.println("\nImage byte code written to new file successfully: " + copiedCat.getAbsolutePath());
//        FileOutputStream out = new FileOutputStream(newImageFile);
//        out.write(imageBytes);
//        out.close();
//        System.out.println("Image byte code written to new file successfully: " + newImageFile.getAbsolutePath());


    }
}
