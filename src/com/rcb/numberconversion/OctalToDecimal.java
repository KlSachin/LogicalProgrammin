package com.rcb.numberconversion;

import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no :");
        long n =sc.nextInt();
        System.out.println(isOctalToDecimal(n));

    }

    public static long isOctalToDecimal(long n){
        long count=0;
        long sum=0;
        while (n>0){
            long d =n%10;
            sum=sum + d * (int)Math.pow(8,count);
            count++;
            n/=10;
        }
        return sum;
    }
}
