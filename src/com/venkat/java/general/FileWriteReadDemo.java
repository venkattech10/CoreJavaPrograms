package com.venkat.java.general;

import java.io.*;

public class FileWriteReadDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String text = "Hello World";
        System.out.println("**************** Approach - 1 ***************");
        //Create FileWriter object with file name
        FileWriter writer = new FileWriter("text.txt");
        //Write the text data into the file
        writer.write(text);
        //close the writer
        writer.close();
        //Create FileReader objecct with file name
        FileReader reader = new FileReader("text.txt");
        int i;
        //Check the condition while printing the file content
        while ((i = reader.read()) != -1) {
            System.out.print((char) i);
        }
        System.out.println();
        System.out.println("**************** Approach - 2 ***************");
        //Create FileOutputStream object with file name
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.txt"));
        //Write the data by using writeObject method
        oos.writeObject("Welcome to the test");
        //close OOS
        oos.close();
        //Create ObjectInputStream object with file name
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"));
        //Read the data by using readObject method
        System.out.println(ois.readObject());

    }
}
