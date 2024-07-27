package com.venkat.java.general;

public class FibonacciSeriesWithRecurssiveDemo {
    static int num1 = 0, num2 = 1, num3, num = 10;

    public static void main(String[] args) {
        //Print first numbers
        System.out.print(num1 + " " + num2); // 0 1
        //Call static method by passing num-2
        //Bcoz first 2 numbers already printed
        fibonacciSeries(num - 2);
    }

    private static void fibonacciSeries(int n) {
        //if condition to break the recurssive method call
        if (n > 0) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(" " + num3); // 1 2 3 5 8 13 21 34
            //Call same recursive method to generate 8 fibonacci numbers
            fibonacciSeries(n - 1);
        }
    }


}
