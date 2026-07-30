package com.rcb.numberconversion;

import java.util.Scanner;

public class DecimalToAllNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int num =sc.nextInt();
        System.out.println("enter the base :");
        int base=sc.nextInt();

        System.out.println(isConvert(num,base));
        sc.close();
    }
    public static String isConvert(int num,int base){
        String res ="";
        String str ="123456789ABCDEF";
        while(num>0){
            int d =num%base;
            res =res+str.charAt(d);
            num/=base;
        }

        return res;
    }
}
