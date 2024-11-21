package org.example;

//Codewars instructions:
//Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.
//
//        Example
//        Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
//        The returned format must be correct in order to complete this challenge.
//
//        Don't forget the space after the closing parentheses!
public class PhoneExample {

    public static String createPhoneNumber(int[] numbers) {
        int n[] = numbers;
        String result = "(" + n[0] + n[1] + n[2] + ")"
                + " " + n[3] + n[4] + n[5] + "-"
                + n[6] + n[7] + n[8] + n[9];
        return result;
    }
}
