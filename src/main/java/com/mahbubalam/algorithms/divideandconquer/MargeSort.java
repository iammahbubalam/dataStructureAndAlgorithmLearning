package com.mahbubalam.algorithms.divideandconquer;

public class MargeSort {
    public static void sort(int[] array) {

        int n = array.length;
        int mid = n / 2;
        if (n < 2) return;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[n - mid];
        System.arraycopy(array, 0, leftArray, 0, mid);
        System.arraycopy(array, mid, rightArray, 0, n - mid);
        sort(leftArray);
        sort(rightArray);
        marge(array, leftArray, rightArray);
    }

    private static void marge(int[] array, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < leftArray.length) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightArray.length) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
