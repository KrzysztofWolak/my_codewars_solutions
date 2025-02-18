package org.example;

import java.util.Arrays;
import java.util.List;

public class PigLatin {
    public static String pigIt(String str) {
        String[] strings = str.split(" ");
        String result = "";
        for (String s: strings) {
            if (s.matches("[a-zA-z]+")) s = s.substring(1) + s.charAt(0) + "ay";
            result += s +" ";
        }
        result = result.trim();
        return result;
    }
}

