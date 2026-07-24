package com.rcb.numberproblems;

import java.util.Scanner;

public class Divisible3and5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no :");
        int n =sc.nextInt();
        isDivisible(n);
    }
    public static void isDivisible(int n){
        if(n%3==0 && n%5==0){
            System.out.println("divisible by Ram and Lakshmana");
        } else if (n%3==0) {
            System.out.println("divisible only ram");
        }
        else {
            System.out.println("divisible on by Lakshman");
        }
    }
}
