package com.mahbubalam.algorithms.sorting;

import org.jetbrains.annotations.NotNull;

public class MInsertionSort {
   public static void sort(@NotNull int arr[]){
        int n = arr.length;
       for (int i = 1; i < n; i++) {
           int temp = arr[i];
           int j = i - 1;
           while (j>=0&&arr[j]>=temp){
               arr[j+1]=arr[j];
               j--;
           }
           arr[j+1]=temp;
       }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        int a[]= new int[500];
        for(int i = 0; i < 500; i++) {
            a[i] = (int)(Math.random() * 500)+1;
        }

        sort(a);
        printArray(a);
    }
}
