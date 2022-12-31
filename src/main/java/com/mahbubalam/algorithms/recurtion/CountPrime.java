package com.mahbubalam.algorithms.recurtion;

public class CountPrime {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 22122, 333, 303, 6524, 28, 626, 66};
        System.out.println("sum = " + sumOfPrime(array, 0, 0));

    }

    public static boolean isPrime(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }


    public static int sumOfPrime(int[] array, int start, int sum) {
        if (start == array.length) return sum;
        else {
            if (isPrime(array[start])) {
                sum = sum + array[start];
                System.out.print(array[start] + " ");
            }
            return sumOfPrime(array, start + 1, sum);
        }
    }
}
