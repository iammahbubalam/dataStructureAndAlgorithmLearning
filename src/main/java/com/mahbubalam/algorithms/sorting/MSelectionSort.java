package com.mahbubalam.algorithms.sorting;

public class MSelectionSort extends Sort {

    public static void main(String[] args) {
        int[] a = new int[500];
        for (int i = 0; i < 500; i++) {
            a[i] = (int) (Math.random() * 500) + 1;
        }

        new MSelectionSort().sort(a);
        printArray(a);
    }

    @Override
    public void sort(int[] array) {
        if (array == null) return;
        final int N = array.length;

        for (int i = 0; i < N; i++) {
            int swapIndex = i;
            for (int j = i + 1; j < N; j++) {
                if (array[j] < array[swapIndex]) {
                    swapIndex = j;
                }
            }
            swap(array, i, swapIndex);
        }
    }

}