package com.mahbubalam.algorithms.divideandconquer;

public class XToThePowerY {

    public static void main(String[] args) {
        System.out.println(xToThePowerY(3,3));
    }

    public static int xToThePowerY(int x, int y){
        if (y==1)return x;
        else {
            if (y%2==0){
                int a=xToThePowerY(x,y/2);
                return a*a;
            }
            else {
                int b=xToThePowerY(x,y/2);
                return x*b*b;
            }
        }
    }
}
