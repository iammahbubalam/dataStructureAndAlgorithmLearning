package com.mahbubalam.algorithms.sorting;

import java.util.Random;

public class MMargeSort extends Sort {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[1001];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100000);
        }

        System.out.println("Before:");
        printArray(numbers);

        new MMargeSort().sort(numbers);

        System.out.println("\nAfter:");
        printArray(numbers);
    }

    @Override
    public void sort(int[] array) {
        int n = array.length;
        int midIndex = n / 2;
        if (n < 2) return;
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[n - midIndex];

        System.arraycopy(array, 0, leftArray, 0, midIndex);
        System.arraycopy(array, midIndex, rightArray, 0, n - midIndex);
        sort(leftArray);
        sort(rightArray);
        marge(array, leftArray, rightArray);
    }

    private void marge(int[] array, int[] leftArray, int[] rightArray) {

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
