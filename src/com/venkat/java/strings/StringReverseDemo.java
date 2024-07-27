package com.venkat.java.strings;

public class StringReverseDemo {
    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println("********* Approach - 1 **********");
        //Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer(input);
        System.out.println(stringBuffer.reverse()); // dlroW olleH
    }
}
