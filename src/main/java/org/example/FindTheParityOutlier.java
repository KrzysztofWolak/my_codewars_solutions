package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//You are given an array (which will have a length of at least 3, but could be very large) containing integers.
// The array is either entirely comprised of odd integers or entirely comprised of even
// integers except for a single integer N. Write a method that takes the array as an argument and
// returns this "outlier" N.
public class FindTheParityOutlier {

    static int find(int[] integers) {
        int odd = 0;
        int even = 0;
        int resultOdd = 0;
        int resultEven = 0;
        for (int i = 0; i < integers.length; i++) {
            if (Math.abs(integers[i] % 2) == 1) {
                odd++;
                resultOdd = integers[i];
            } else {
                even++;
                resultEven = integers[i];
            }
        }
        if (odd > even) return resultEven;
        else return resultOdd;
    }
}

