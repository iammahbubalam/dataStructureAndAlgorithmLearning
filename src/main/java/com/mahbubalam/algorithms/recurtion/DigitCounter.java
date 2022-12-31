package com.mahbubalam.algorithms.recurtion;

public class DigitCounter {
    public static void main(String[] args) {
        System.out.println(digitCounter(44));
    }

    public static int digitCounter(int n) {
        if (n == 0) return 0;
        else {
            int ans = digitCounter(n / 10);
            return ans + 1;
        }
    }
}
