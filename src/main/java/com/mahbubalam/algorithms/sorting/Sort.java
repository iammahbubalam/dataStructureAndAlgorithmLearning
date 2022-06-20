package com.mahbubalam.algorithms.sorting;

abstract class Sort {
     public abstract  void sort(int[] array);

    public static void swap(int[] ar, int i, int j) {
        int tmp = ar[i];
        ar[i] = ar[j];
        ar[j] = tmp;
    }


    public static void printArray(int[] arr)
    {
        for (int j : arr) System.out.print(j + " ");

        System.out.println();
    }

}
