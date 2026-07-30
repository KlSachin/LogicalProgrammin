package com.rcb.numberconversion;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no :");
        int n =sc.nextInt();

        System.out.println(isDecimal(n));
    }
    public static String isDecimal(int n){
        int count=0;
        String binary ="";
        int k=2;
        while(n>0){
            int d =n%2;

                binary =d+binary;

            n=n/2;
        }
        return binary;
    }
}
