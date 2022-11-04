package com.mahbubalam.algorithms.recurtion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    public static int factorial(int n){

        if (n<=1) return 1;
        else return factorial(n-1)*n;
    }
}