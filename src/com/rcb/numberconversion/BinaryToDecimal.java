package com.rcb.numberconversion;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no :");
        long n =sc.nextInt();
        System.out.println(isBinary(n));

    }
    public static long isBinary(long n ){
        int count=0;
        long sum =0;
        int k=2;
        while(n>0){
        long d =n%10;
        sum =sum+d*(int)Math.pow(k,count);
        count++;
        n /= 10;

        }
        return sum;

    }
}
