package com.mahbubalam.algorithms.recurtion;

public class MaxFrom2d {
    public static void main(String[] args) {
        int[][] a = {{5, 2, 3,}, {4, 24524, 6}, {7, 0, 1}};
        System.out.println(max(a, 0, 0, Integer.MIN_VALUE));
    }

    ////unsolved
    //15. Write a recursive program to find the maximum of a 2d array.
    //16. Write a recursive program to count the prime numbers of a given 2d array.
    public static int max(int[][] array, int i, int j, int max) {
        if (array[i][j] > max) max = array[i][j];
        if (i == array.length - 1 && j == array[i].length - 1) return max;
        else {
            if (i + 1 < array.length) return max(array, i + 1, j, max);
            else if (j + 1 < array[i].length) return max(array, i, j + 1, max);
            else return max;
        }
    }
}
