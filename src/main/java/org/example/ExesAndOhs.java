package org.example;

//Check to see if a string has the same amount of 'x's and 'o's.
// The method must return a boolean and be case insensitive. The string can contain any char.
//
//Examples input/output:
//
//XO("ooxx") => true
//XO("xooxx") => false
//XO("ooxXm") => true
//XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
//XO("zzoo") => false

public class ExesAndOhs {
    public boolean getXO(String str) {
        // if (ending.length() > str.length()) return false;
        int x = 0;
        int o = 0;
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equalsIgnoreCase("x")) x += 1;
            if (String.valueOf(str.charAt(i)).equalsIgnoreCase("o")) o += 1;
        }
        if (x == o) return true;
        return false;
    }
}
