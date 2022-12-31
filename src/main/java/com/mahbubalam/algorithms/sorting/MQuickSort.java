package com.mahbubalam.algorithms.sorting;

import java.util.Random;

public class MQuickSort extends Sort {
    public static void main(String[] args) {
        int[] a = new int[50];
        for (int i = 0; i < 50; i++) {
            a[i] = (int) (Math.random() * 50) + 1;
        }
        printArray(a);
        new MQuickSort().sort(a);
        printArray(a);
    }

    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int smallIndex, int highIndex) {
        if (smallIndex >= highIndex) return;
        int pivotIndex = new Random().nextInt(highIndex - smallIndex) + smallIndex;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, highIndex);


        int leftPointer = smallIndex;
        int rightPointer = highIndex;
        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);
        quickSort(array, smallIndex, leftPointer - 1);
        quickSort(array, leftPointer + 1, highIndex);
    }
}
