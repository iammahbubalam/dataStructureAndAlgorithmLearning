package com.mahbubalam.algorithms.sorting;

import java.util.Arrays;

public class MCountingSortOne extends Sort{

    @Override
    public void sort(int[] array) {

        int n = array.length;
        int max = Arrays.stream(array).max().getAsInt();
        int[] count = new int[max+1];
        int[] output = new int[n];
        for (int i = 0; i <= max; i++) {
            count[i]=0;
        }
        for (int i = 0; i < n; i++) {
            count[array[i]]++;
        }

        int i=0;
        int j = 0;
        while(i<=max){
            if(count[i]>0){
                output[j]=i;
                count[i]--;
                j++;
            }else{
                i++;
            }
        }
        System.arraycopy(output,0,array,0,n);
    }

    public static void main(String[] args) {
        int[] a = new int[50];
        for(int i = 0; i < 50; i++) {
            a[i] = (int)(Math.random() * 500)+1;
        }

        printArray(a);
        new MCountingSortOne().sort(a);
        printArray(a);
    }
}
