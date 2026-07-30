package com.rcb.numberconversion;

import java.util.Scanner;

public class HexaToDecimal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no :");
        int n =sc.nextInt();
        System.out.println(ishexaToDecima(n));
    }
    public static int ishexaToDecima(int n){
        int sum=0;
        int count=0;
        while(n>0){
            int d =n%10;
            sum = sum+d*(int)Math.pow(16,count);
            count++;
            n=n/10;
        }
        return sum;
    }

}
