package com.venkat.java.general;

public class NumberSwapDemo {
    public static void main(String[] args) {
        int num1 = 1, num2 = 2;
        //With using temporary variable
        System.out.println("***************** Approach - 1 ****************");
        /*System.out.println("Before swap: " + num1+" "+num2);
        //first assign num1 to temp
        int temp = num1 ;
        //And num2 to num1
        num1 = num2 ;
        //Finally assign temp to num2
        num2 = temp ;
        System.out.println("After swap: " + num1+" "+num2);*/
        System.out.println("***************** Approach - 2 ****************");
        //Without using third variable
        System.out.println("Before swap: " + num1 + " " + num2);
        //sum 2 nums and assign to num2 or num1
        num2 = num1 + num2; //3
        //For num1 subtract num1 from num2
        num1 = num2 - num1; // 3-1 = 2
        //For num2 also subtract num1 from num2
        num2 = num2 - num1; // 3-2 = 1
        System.out.println("After swap: " + num1 + " " + num2);
    }


}
