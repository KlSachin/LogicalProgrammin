package com.rcb.numberproblems;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        isSequence(n);
    }

    public static void isSequence(int n) {
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {


            int res = a + b;
            a = b;
            b = res;
            System.out.println("The Fibonacci of " + i + " is " + a);
        }
    }
}