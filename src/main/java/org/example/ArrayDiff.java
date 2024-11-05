package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


//Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
//
//It should remove all values from list a, which are present in list b keeping their order.
//
//Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
//If a value is present in b, all of its occurrences must be removed from the other:
//
//Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}


public class ArrayDiff {
    public int[] arrayDiff(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();
        boolean change = false;
        for (int i = 0; i < a.length; i++) {
            change = false;
            for (int j = 0; j < b.length; j++) {
                if ((a[i] == b[j])) change = true;
            }
            if (change == false) list.add(a[i]);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) result[i] = list.get(i);
        return result;
    }

    public int[] arrayDiff2(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().toList();
        List<Integer> listB = Arrays.stream(b).boxed().toList();
        listA.remove(listB);
        return listA.stream().mapToInt(e -> e).toArray();
    }
}

