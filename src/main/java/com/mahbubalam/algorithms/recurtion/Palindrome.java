package com.mahbubalam.algorithms.recurtion;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("aammaa",0,5));
    }
    public static boolean isPalindrome(String string , int i , int j){
        if (i>=j)return true;
        if (string.charAt(i)!=string.charAt(j))return false;
        else return isPalindrome(string,i+1,j-1);
    }
}
