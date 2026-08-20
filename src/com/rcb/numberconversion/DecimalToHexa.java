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
        String hex ="0123456789ABCDEF";
        while (n>0){
            int d =n%16;
            n=n/16;
           if(d>=0 && d<=9){
               sum=d+sum;
           }
           else{
               int r =55+d;
              char ch =(char)r;

              sum =ch+sum;
           }

        }
        return sum;
    }
}
