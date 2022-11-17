package com.mahbubalam.algorithms.divideandconquer;

public class CalculateSumOfEven {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(calculateSumOfEven(array,0,array.length-1));

    }
    public static int calculateSumOfEven(int[] array, int start, int end){
        if (start==end){
            if(array[start]%2==0)return array[start];
            else return 0;
        }else {
            int mid = (start+end)/2;
            return calculateSumOfEven(array,start,mid)+calculateSumOfEven(array,mid+1,end);
        }
    }
}
