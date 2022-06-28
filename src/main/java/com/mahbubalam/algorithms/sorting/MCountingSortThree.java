package com.mahbubalam.algorithms.sorting;

import java.util.Arrays;

public class MCountingSortThree extends  Sort{
    @Override
    public void sort(int[] array) {
        int n = array.length;
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        int range = max - min +1;
        int[] count = new int[range];
        int[] output = new int[n];
        for (int i = 0; i < range; i++) {
            count[i]=0;
        }
        for (int i = 0; i < n; i++) {
            count[array[i]-min]++;
        }

        for (int i = 1; i < range; i++) {
            count[i]+=count[i-1];
        }
        for (int i = n-1; i >=0 ; i--) {
            output[count[array[i]-min]-1]=array[i];
            count[array[i]-min]--;
        }
        System.arraycopy(output,0,array,0,n);
    }
    public static void main(String[] args) {
//        int[] a = new int[50];
//        for(int i = 0; i < 50; i++) {
//            a[i] = (int)(Math.random() * 50)+1;
//        }
        int[] a = {-6,-9,9,5,1,9};
        printArray(a);
        new MCountingSortThree().sort(a);
        printArray(a);
    }
}
