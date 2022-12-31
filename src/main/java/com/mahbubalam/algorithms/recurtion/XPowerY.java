package com.mahbubalam.algorithms.recurtion;

public class XPowerY {
    public static void main(String[] args) {
        System.out.println(xPowerY(3, 60));
        System.out.println(Math.pow(3, 20));
    }

    public static int xPowerY(int x, int y) {
        if (y != 0)
            return (x * xPowerY(x, y - 1));
        else
            return 1;
    }
}
