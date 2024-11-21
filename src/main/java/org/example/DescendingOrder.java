package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Codewars instructions:
//Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
//
//Examples:
//Input: 42145 Output: 54421
//
//Input: 145263 Output: 654321
//
//Input: 123456789 Output: 987654321

public class DescendingOrder {
    public static int sortDesc(final int num) {
        List<String> list = new ArrayList<>();
        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            list.add(String.valueOf(str.charAt(i)));
        }
        Collections.sort(list, Collections.reverseOrder());
        String endStr = "";
        for (String s : list) {
            endStr += s;
        }
        return Integer.parseInt(endStr);
    }
}
