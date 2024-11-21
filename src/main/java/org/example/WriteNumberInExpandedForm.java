package org.example;

//Codewars instructions:
//Write Number in Expanded Form
//        You will be given a number and you will need to return it as a string in Expanded Form. For example:
//
//        12 --> "10 + 2"
//        45 --> "40 + 2"
//        70304 --> "70000 + 300 + 4"
//        NOTE: All numbers will be whole numbers greater than 0.
//
//        If you liked this kata, check out part 2!!

public class WriteNumberInExpandedForm {
    public String expandedForm(int num) {
        String result = "";
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            if (result.equals(String.valueOf(num))) break;
            if (!(s.charAt(i) == '0')) {
                if (!(result.equals(""))) result += " + ";
                result += s.charAt(i);
                for (int j = i; j < s.length() - 1; j++) {
                    result += "0";
                }
            }
        }
        System.out.println(result);
        return result;
    }
}