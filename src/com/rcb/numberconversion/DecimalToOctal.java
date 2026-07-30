package com.rcb.numberconversion;

import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no :");
        long n =sc.nextInt();
        System.out.println(isDecimal(n));

    }
    public static  String isDecimal(long n){
        String sum="";

        while (n>0){
            long d = d=n%8;

            sum=d+sum;
            n/=8;

        }
        return sum;

    }
}
