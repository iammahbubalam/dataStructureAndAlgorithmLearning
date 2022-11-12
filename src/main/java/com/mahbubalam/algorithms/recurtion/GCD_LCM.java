package com.mahbubalam.algorithms.recurtion;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(24,60));
        System.out.println(lcm(24,60));
    }
    public static int gcd(int x,int y){
        if (y==0)return x;
        else return gcd(y,x%y);
    }
    public static  int lcm(int a, int b){
        return lcm(a,b,0);
    }

  public static   int lcm(int a, int b,int common)
    {
        // increase common by adding max value
        common += b;

        if(common%a == 0) return common; //base case
        else return lcm(a, b,common); // general case
    }


}

