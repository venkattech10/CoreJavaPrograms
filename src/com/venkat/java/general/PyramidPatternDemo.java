package com.venkat.java.general;
/*           *
            * *
           * * *
          * * * *
         * * * * *
 */
public class PyramidPatternDemo {
    public static void main(String[] args) {
        int rows = 5;
        //Note : If we want to print 1 2 3's we have to take variable & increment based on row value
        //Outer loop to print given rows
        for (int i = 0; i < rows; i++) {
            //Inner loop to print the spaces to those many spaces rows - i
            //If we comment this for loop this program works like RightTrianglePattern
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }
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
