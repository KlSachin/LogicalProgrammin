package com.rcb.numberproblems;

import java.util.Scanner;

public class HarshadNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no :");
        int n =sc.nextInt();
        int original=n;
        int sum =0;
        while(n>0){
            int d =n%10;
            sum= sum+d;
            n=n/10;
        }
        if(original%sum==0){
            System.out.println(original+" Harshad no");
        }
        else{
            System.out.println(original+" is not a harshad no");
        }
    }
}
