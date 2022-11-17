package com.mahbubalam.algorithms.divideandconquer;

import java.util.Arrays;

public class FindMaxMin {

    public static void main(String[] args) {
        int[] array = {-5,2,3,55,5,6,7,8,9,-10};
        System.out.println(Arrays.toString(arrayMaxMin(array, 0, array.length - 1)));

    }


    public static int[] arrayMaxMin(int[] array,int start, int end){
        if (start==end) return new int[]{array[start],array[start]};
        else {
            int mid =(start+end)/2;
            int[] maxMinFromFirstHalf=arrayMaxMin(array,start,mid);
            int[] maxMinFromSecondHalf=arrayMaxMin(array,mid+1,end);
            int max= Math.max(maxMinFromFirstHalf[0],maxMinFromSecondHalf[0]);
            int min= Math.min(maxMinFromFirstHalf[1],maxMinFromSecondHalf[1]);
            return new int[]{max,min};
        }

    }
}
