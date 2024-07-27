package com.venkat.java.general;

public class NumberReverseDemo {
    public static void main(String[] args) {
        int number = 987;
        int reverseNumber = 0;
        //Using while loop Bcoz we don't know the no.of iterations
        //untill number > 0 or num != 0
        while (number > 0) {
            //find out the remainder by % operator - 987 % 10 = 7
            int remainder = number % 10;
            //add the remainder to reverse number *10 to get the tens place
            reverseNumber = reverseNumber * 10 + remainder;
            //remove the last number by dividing by 10 -- num/10
            number = number / 10;
        }
        System.out.println(reverseNumber); // 789
    }
}
