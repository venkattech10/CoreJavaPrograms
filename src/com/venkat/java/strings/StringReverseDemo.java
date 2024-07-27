package com.venkat.java.strings;

public class StringReverseDemo {
    public static void main(String[] args) {
        String input = "Hello World";
        String reversedInput = "";
        System.out.println("********* Approach - 1 **********");
        //Using StringBuffer
        //Create StringBuffer object by passing input string in constructor
        StringBuffer stringBuffer = new StringBuffer(input);
        //call reverse() of sb object
        System.out.println(stringBuffer.reverse()); // dlroW olleH
        System.out.println("********* Approach - 2 **********");
        //Without using predefined methods
        //As we know the no.of iterations we are using for loop
        //We need to print reverse order so loop should start with
        //length -1 Bcoz index starts with 0
        //Condition should satisfy with greater than or equal to 0
        for (int i = input.length() - 1; i >= 0; i--) {
            //take character by passing index
            char ch = input.charAt(i);
            //append that character into reversed String
            reversedInput = reversedInput + ch;
        }
        //Print the reversed string
        System.out.println(reversedInput); // dlroW olleH
    }
}
