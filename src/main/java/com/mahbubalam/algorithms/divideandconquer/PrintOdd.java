package com.mahbubalam.algorithms.divideandconquer;

public class PrintOdd {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        printOdd(array,0,array.length-1);

    }
    public static void printOdd(int[] array, int start, int end){
        if (start==end){
            if (array[start]%2==1) System.out.print(array[start]+" ");
        }else {
            int mid = (start+end)/2;
            printOdd(array,start,mid);
            printOdd(array,mid+1,end);
        }
    }
}
