package com.rcb.patterns;

public class InvertedHalf {

    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {//once used variable not use
                System.out.print("*");

            }

            System.out.println();
        }
    }
}
