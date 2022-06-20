package com.mahbubalam.algorithms.sorting;


public class MInsertionSort  extends  Sort {

    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] >= temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }


    public static void main(String[] args) {
        int[] a = new int[500];
        for (int i = 0; i < 500; i++)
            a[i] = (int) (Math.random() * 500) + 1;

        new MInsertionSort().sort(a);
        printArray(a);
    }


}
