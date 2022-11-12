package com.mahbubalam.algorithms.recurtion;

public class CountNumberOfDigitsInteger {
    public static void main(String[] args) {
        System.out.println(count(555));
        System.out.println(sum(555562));
    }
    public static int count(int number){
        if(number%10==0)return 0;
        else return 1+count(number/10);
    }
    public static int sum(int number){
        if(number%10==0)return number;
        else return (number%10)+sum(number/10);
    }

    static int rev(int n, int temp)
    {
        if (n == 0) return temp;
        temp = (temp * 10) + (n % 10);
        return rev(n / 10, temp);
    }
}
