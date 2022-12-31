package com.mahbubalam.algorithms.recurtion;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(digitSum(445544));
    }

    public static int digitSum(int n) {
        if (n == 0) return 0;
        else {
            int ans = n % 10;
            return ans + digitSum(n / 10);
        }
    }
}
