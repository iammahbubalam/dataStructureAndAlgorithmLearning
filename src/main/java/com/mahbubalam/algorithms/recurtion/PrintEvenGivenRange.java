package com.mahbubalam.algorithms.recurtion;

public class PrintEvenGivenRange {
    public static void main(String[] args) {
        print(2, 10);
    }

    public static void print(int a, int b) {
        if (a == b) {
            if (a % 2 == 0) System.out.println(a);
        } else {
            if (a % 2 == 0) System.out.println(a);
            print(a + 1, b);
        }
    }
}
