package org.example;

import java.util.ArrayList;


//Complete the solution so that the function will break up camel casing, using a space between words.
//
//Example
//"camelCasing"  =>  "camel Casing"
//"identifier"   =>  "identifier"
//""             =>  ""


public class BreakCamelCase {
    public static String camelCase(String input) {
        ArrayList<String> arrayList = new ArrayList<>();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                if (arrayList.isEmpty()) arrayList.add(input.substring(0, i));
                for (int j = i + 1; j < input.length(); j++) {
                    if (Character.isUpperCase(input.charAt(j))) {
                        arrayList.add(input.substring(i, j));
                        break;
                    }
                    if ((j + 1) == input.length() && Character.isUpperCase(input.charAt(j)) == false)
                        arrayList.add(input.substring(i, input.length()));
                }
            }
            if (arrayList.isEmpty() && i + 1 == input.length()) result = input;
        }
        for (String x : arrayList) {
            result += x + " ";
        }
        result = result.trim();
        return result;
    }
}
//  Albo tak ;)
// public static String camelCase(String input) {
//        return input.replaceAll("([A-Z])", " $1");