package com.mahbubalam.algorithms.recurtion;

public class RecursiveArrayProblems {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(countEvenOdd(array, 1, array.length - 1));
        System.out.println(avgOfArray(array, 0, array.length - 1));
        System.out.println(sumOfArray(array, array.length - 1));
        System.out.println(productOfArray(array, array.length - 1));
        System.out.println(maxNumOfArray(array, array.length - 1));
        System.out.println(minNumOfArray(array, array.length - 1));
        printArrayReverse(array, array.length - 1);

    }

    public static int countEvenOdd(int[] arr, int i, int n) {
        if (n < 0) return 0;
        else return (arr[n] % 2 == i ? 1 : 0) + countEvenOdd(arr, i, n - 1);

    }

    public static void printArrayReverse(int[] arr, int n) {
        if (n < 0) return;
        else {
            System.out.println(arr[n]);
            printArrayReverse(arr, n - 1);
        }

    }

    public static float avgOfArray(int[] arr, int i, int n) {

        if (i == n - 1)
            return arr[i];
        if (i == 0)
            return ((arr[i] + avgOfArray(arr, i + 1, n)) / n);
        return (arr[i] + avgOfArray(arr, i + 1, n));

    }

    public static int sumOfArray(int[] a, int n) {
        if (n == 0)
            return (a[n]);
        else
            return (a[n] + sumOfArray(a, n - 1));
    }

    public static int productOfArray(int[] a, int n) {
        if (n == 0)
            return (a[n]);
        else
            return (a[n] * productOfArray(a, n - 1));
    }

    public static int maxNumOfArray(int[] a, int n) {
        if (n == 0)
            return (a[n]);
        else
            return Math.max(maxNumOfArray(a, n - 1), a[n]);
    }

    public static int minNumOfArray(int[] a, int n) {
        if (n == 0)
            return (a[n]);
        else
            return Math.min(minNumOfArray(a, n - 1), a[n]);
    }

}
