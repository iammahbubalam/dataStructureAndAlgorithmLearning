package com.mahbubalam.algorithms.recurtion;

public class SumOfSeriesUsingRecursion {
    public static void main(String[] args) {
        System.out.println(sqrLinearSum(5));
        System.out.println(linearSum(5));
//        System.out.println(unKnownSum3(2,3,4,5));
        System.out.println(unKnownSum3(2, 3, 4, 5));
    }

    // 1 + 2 + 3 + ⋯
    public static int linearSum(int n) {
        if (n < 1) return 0;
        if (n == 1) return 1;
        else return n + linearSum(n - 1);
    }

    //1^2+2^2+3^2+4^2........
    public static int sqrLinearSum(int n) {
        if (n == 1) return 1;
        else {
            return sqrLinearSum(n - 1) + n * n;
        }
    }

    // 1 ∗ 3 + 2 ∗ 5 + 3 ∗ 7 + 4 ∗ 9 + ⋯
    public static int unKnownSum(int n) {
        if (n == 1) return n * 3;
        else {
            return unKnownSum(n - 1) + n * (n * 2 + 1);
        }
    }

    // 2 ∗ 3 + 4 ∗ 5 + 8 ∗ 7 + 16 ∗ 9 + ⋯
    public static int unKnownSum2(int a, int b, int n) {
        if (b == (n + 1) * 2 + 1) return 0;
        else {
            return unKnownSum2(a * 2, b + 2, n) + a * b;
        }
    }

    //2 ∗ 3 ∗ 4 + 4 ∗ 5 ∗ 3 + 8 ∗ 7 ∗ 2 + 16 ∗ 9 ∗ 1 + ⋯
    public static int unKnownSum3(int a, int b, int c, int n) {
        if (b == (n + 1) * 2 + 1) return 0;
        else {
            return unKnownSum3(a * 2, b + 2, c - 1, n) + (a * b * c);
        }
    }


}
