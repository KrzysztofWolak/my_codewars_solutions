package org.example;

//Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
//
//Examples:
//
//solution('abc', 'bc') // returns true
//solution('abc', 'd') // returns false


import com.sun.source.tree.DoWhileLoopTree;
import com.sun.source.tree.WhileLoopTree;

import java.lang.annotation.Documented;
import java.util.Locale;

public class StringEndsWith {
    public boolean solution(String str, String ending) {

        // rozwiązanie bez metody endsWith

//        boolean result = true;
//        if (ending.length() > str.length()) return false;
//        for (int i = 0; i < ending.length(); i++) {
//            if (str.charAt(str.length() - 1 - i) == ending.charAt(ending.length() - 1 - i)) result = true;
//            else result = false;
//            if (result == false) break;
//  return result      }
        return str.endsWith(ending);
    }
}


