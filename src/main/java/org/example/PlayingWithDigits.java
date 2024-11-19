package org.example;

public class PlayingWithDigits {

        public static long digPow(int n, int p) {
            String str = String.valueOf(n);
            int powSum = 0;
            for (int i = 0; i< str.length(); i++) {
                int num = Character.getNumericValue(str.charAt(i));
                powSum += (int) Math.pow(num,(p+i));
            }
            long k = powSum/n;
            if(powSum % n == 0) return k;
    else return -1;
        }
    }

