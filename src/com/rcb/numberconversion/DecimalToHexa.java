package com.rcb.numberconversion;

import java.util.Scanner;

public class DecimalToHexa {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no :");
        int n =sc.nextInt();
        System.out.println(isDecimalToXexa(n));
    }
    public static String isDecimalToXexa(int n){
        String sum="";
        while (n>0){
            int d =n%16;
            sum =d+sum;
            n/=16;
        }
        return sum;
    }
}
