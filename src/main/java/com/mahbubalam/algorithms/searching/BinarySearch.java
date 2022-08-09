package com.mahbubalam.algorithms.searching;

public class BinarySearch {

    public static int search(int[] array, int key){

        int left = 0;
        int right = array.length-1;
        while (left<=right){
            int mid = left+(right-left)/2;
            if (array[mid]==key) return mid;
            if (array[mid]<key) left=mid+1;
            else right = mid-1;
        }

        return  -1;
    }
}
