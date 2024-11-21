package org.example;

//Codewars instructions:
//Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
//
//        Example(Input => Output):
//        35231 => [1,3,2,5,3]
//        0 => [0]

public class ConvertNumberToReversedArrayOfDigits {
    public int[] digitize(long n) {
        String s = String.valueOf(n);

        int r = s.length();
        int result[] = new int[r];
        for (int i = 0; i < s.length(); i++) {
            result[i] = Integer.parseInt(String.valueOf(s.charAt(s.length() - 1 - i)));
        }
        return result;
    }
}
