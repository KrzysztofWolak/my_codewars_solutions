package org.example;

import java.util.List;
import java.util.StringJoiner;

public class SpinWords {
    public String spinWords(String sentence) {
        String result = "";
        String[] tab = sentence.split(" ");
        for(int i = 0; i< tab.length; i++) {
            String s = tab[i];
            if (s.length() >= 5 ) {
                String a = new StringBuffer(s).reverse().toString();
                result += a + " ";
            } else result += s + " ";
        }
       result = result.trim();
        return result;
    }
}
