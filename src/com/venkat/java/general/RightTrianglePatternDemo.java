package com.venkat.java.general;

public class RightTrianglePatternDemo {
    public static void main(String[] args) {
        int rows = 5;
        //Note : If we want to print 1 2 3's we have to take variable & increment based on row value
        //Outer loop to print given rows
        for (int i = 0; i < rows; i++) {
            //Inner loop to print columns for each row
            for (int j = 0; j <= i; j++) {
                //Print * & space
                System.out.print("* ");
            }
            //To move cursor to next line
            System.out.println();
        }
    }
}
