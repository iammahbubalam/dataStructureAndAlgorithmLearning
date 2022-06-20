package com.mahbubalam.algorithms.sorting;

public class MBubbleSort extends  Sort{

    @Override
    public void sort(int[] array) {
        int n = array.length;
        boolean swaped;
        for (int i = 0; i < n-1; i++) {
            swaped= false;
            for (int j = 0; j < n-i-1; j++) {
                if (array[j]>array[j+1]){
                    swap(array,j,j+1);
                    swaped=true;
                }
            }
            if (!swaped)break;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[500];
        for(int i = 0; i < 500; i++) {
            a[i] = (int)(Math.random() * 500)+1;
        }

        new MBubbleSort().sort(a);
        printArray(a);
    }
}
