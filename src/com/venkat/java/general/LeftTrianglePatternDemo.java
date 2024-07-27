package com.venkat.java.general;
/*       *
       * *
     * * *
   * * * *
 * * * * *
 */
public class LeftTrianglePatternDemo {
    public static void main(String[] args) {
        int rows = 5;
        //Note : If we want to print 1 2 3's we have to take variable & increment based on row value
        //Outer loop to print given rows
        for (int i = 0; i < rows; i++) {
            //Inner loop to print the spaces to those many spaces * 2
            //If we comment this for loop this program works like RightTrianglePattern
            for (int j = 2 * (rows - i); j >= 0; j--) {
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
