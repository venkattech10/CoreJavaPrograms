package com.venkat.java.general;

public class FibonacciSeriesDemo {
    public static void main(String[] args) {
        //initialize 2 nums with 0 & 1 & take third variable
        int num1 = 0, num2 = 1, num = 10, num3;
        //Print num1 & num2 as they are fixed
        System.out.print(num1 + " " + num2); // 0 1
        //Output : 0 1 1 2 3 5 8 13 21 34
        //Start for loop from 0 to num-2 or from 2 to num
        //Bcoz already 2 numbers printed
        for (int i = 0; i < num - 2; i++) {
            // Add first & second number and assign to third vairable
            num3 = num1 + num2;
            //swap second num to first to move the cursor
            num1 = num2;
            //swap third num to second to move the cursor
            num2 = num3;
            //print third number
            System.out.print(" " + num3); // 1 2 3 5 8 13 21 34
        }
    }
}
