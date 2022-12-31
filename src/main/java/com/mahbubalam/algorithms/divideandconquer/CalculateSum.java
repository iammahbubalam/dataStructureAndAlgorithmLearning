package com.mahbubalam.algorithms.divideandconquer;

public class CalculateSum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(calculateSum(array, 0, array.length - 1));

    }

    public static int calculateSum(int[] array, int start, int end) {
        if (start == end) {
            return array[start];
        } else {
            int mid = (start + end) / 2;
            return calculateSum(array, start, mid) + calculateSum(array, mid + 1, end);
        }
    }
}
