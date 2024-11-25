package org.example;

import java.util.ArrayList;
import java.util.List;

//Codewars instruction:
//Create a parser to interpret and execute the Deadfish language.
//Deadfish operates on a single value in memory, which is initially set to 0.
//It uses four single-character commands:
//
//i: Increment the value
//d: Decrement the value
//s: Square the value
//o: Output the value to a result array
//All other instructions are no-ops and have no effect.
//Examples
//Program "iiisdoso" should return numbers [8, 64].
//Program "iiisdosodddddiso" should return numbers [8, 64, 3600].


public class MakeTheDeadfishSwim {
    public static int[] parse (String data) {
        List <Integer> list = new ArrayList<>();
        int num = 0;
            for (int i = 0; i < data.length(); i++) {
                if (data.charAt(i) == 'i') num++;
                if (data.charAt(i) == 'd') num--;
                if (data.charAt(i) == 's') num = (int) Math.pow(num, 2d);
                if (data.charAt(i) == 'o') {
                    list.add(num);
                }
            }
            int[] resultArray = new int[list.size()];
            for(int i = 0; i< list.size(); i++) {
                resultArray[i] = list.get(i);
            }
            return resultArray;
//            Or like this :
//            return list.stream().mapToInt(i->i).toArray();
    }
}
