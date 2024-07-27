package com.venkat.java.general;

import java.util.stream.IntStream;

public class PrimeNumberDemo {
    public static void main(String[] args) {
        int num = 13;
        boolean isPrime = testPrime(num);

        System.out.println("******************* Approach - 1 ******************");
        System.out.println("Given number is: " + (isPrime ? "Prime" : "Not a Prime"));
        System.out.println("******************* Approach - 2 ******************");
        //Prime number Generation from 2 to 100
        for (int i = 2; i <= 100; i++) {
            if (testPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Without using Java 8
    /*public static boolean testPrime(int num) {
        //Get the number & use for loop starts with 2 & less than num
        for (int i = 2; i < num; i++) {
            //check the num with i & return false if num is divisible by 2
            //else return true
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }*/

    //With using Java 8

    public static boolean testPrime(int num) {
        //rangeClosed is similar to for loop starts with 2 and ends with num/2
        //use noneMatch is similar to if condition to check divisablity
        return IntStream.rangeClosed(2,num/2).noneMatch(i -> num % i == 0);
    }
}
