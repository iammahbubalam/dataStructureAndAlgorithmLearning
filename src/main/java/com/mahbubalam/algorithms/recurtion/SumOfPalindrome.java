package com.mahbubalam.algorithms.recurtion;

public class SumOfPalindrome {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,22122,333,303,6524,28,626,66};
        System.out.println("sum = "+sum_palindrome(array, 0,0));

    }

    public static boolean isPalindrome(String string,int start,int end){
        if (start>=end)return true;
        else {
            if (string.charAt(start)==string.charAt(end)){
                return isPalindrome(string,start+1,end-1);
            }
            return false;
        }
    }
    public static boolean isPalindrome(String string){
        return isPalindrome(string,0,string.length()-1);
    }

    public static int sum_palindrome(int[] array, int start ,int sum){
        if(start==array.length) return sum;
        else {
            if (isPalindrome(Integer.toString(array[start]))){
                sum=sum+array[start];
                System.out.print(array[start]+" ");
            }
            return sum_palindrome(array,start+1,sum);
        }

    }

}
