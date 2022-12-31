package com.mahbubalam.algorithms.sorting;

import java.util.Arrays;

public class MCountingSortTwo extends Sort {
    public static void main(String[] args) {
        int[] a = new int[50];
        for (int i = 0; i < 50; i++) {
            a[i] = (int) (Math.random() * 50) + 1;
        }
//        int[] a = {2,9,5,1,9};
        printArray(a);
        new MCountingSortTwo().sort(a);
        printArray(a);
    }

    @Override
    public void sort(int[] array) {
        int n = array.length;
        int max = Arrays.stream(array).max().getAsInt();
        int[] count = new int[max + 1];
        int[] output = new int[n];
        for (int i = 0; i <= max; i++) {
            count[i] = 0;
        }
        for (int j : array) {
            count[j]++;
        }

        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }
        System.arraycopy(output, 0, array, 0, n);
    }
}
