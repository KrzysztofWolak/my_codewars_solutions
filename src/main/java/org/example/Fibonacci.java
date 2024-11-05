package org.example;

public class Fibonacci {
    public Integer fibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

    public Integer fibonacci2(int n) {
        if (n == 1) return 1;
        if (n == 0) return 0;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public int fibonacciLoop(int number) {
        int previousNum = 0;
        int nextNum = 1;
        if (number == 0) return 0;

        for (int i = 1; i < number; i++) {
            nextNum = nextNum + previousNum;
            previousNum = nextNum - previousNum;
        }
        return nextNum;
    }
}
