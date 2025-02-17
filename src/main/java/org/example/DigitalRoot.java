package org.example;

import java.util.Arrays;

public class DigitalRoot {
    public static int digital_root(int n) {
        String s = String.valueOf(n);
        int result = 0;
            for (int i = 0; i < s.length(); i++) {
                result += Character.getNumericValue((s.charAt(i)));
                if (i + 1 == s.length() && result > 9) {
                    s = String.valueOf(result);
                    i = -1;
                    result = 0;
                }
            }
        return result;
    }
}