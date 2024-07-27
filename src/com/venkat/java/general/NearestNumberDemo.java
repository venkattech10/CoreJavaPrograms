package com.venkat.java.general;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class NearestNumberDemo {
    public static void main(String[] args) {
        Integer[] intArr = new Integer[]{3, 8, 1, 4, 9, 3, 2, 1, 7, 8};
        int target = 5;
        System.out.println("************ Approach - 1 ************");
        //Without using Java 8
        int nearest = nearestNumber(intArr, target);
        System.out.println(nearest);
        System.out.println("************ Approach - 2 ************");
        //With using Java 8
        //Convert array to stream
        //apply min by using comparator of all array elements with target
        //And take min value difference b/w array element & target
        Optional<Integer> nearestNumber = Arrays.stream(intArr)
                .min(Comparator.comparingInt(i -> Math.abs(i - target)));
        System.out.println(nearestNumber.get());

    }

    public static int nearestNumber(Integer[] intArr, int target) {
        //findout the left & right array sizes
        int left = 0, right = intArr.length - 1; // 3, 8, 1, 4, 9, 3, 2, 1, 7, 8
        //Here we don't know the no.of iterations
        //So we are taking while loop until we find the less difference b/w
        //Array element & target element
        while (left < right) {
            //left element - target is less than or equal to right side comparison element
            //Then right-- ( move right cursor to -1 )
            //else left++ ( move left cursor to +1 )
            if (Math.abs(intArr[left] - target) <= Math.abs(intArr[right] - target)) {
                right--;
            } else {
                left++;
            }
        }
        //Finally return left cursor element
        return intArr[left];
    }
}
