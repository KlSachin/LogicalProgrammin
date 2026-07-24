package com.rcb.numberproblems;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the num to a :");
        int a =sc.nextInt();
        System.out.println("enter the num to b :");
        int b =sc.nextInt();
        System.out.println("enter the num to c:");
        int c =sc.nextInt();

        System.out.println(isLargest(a,b,c));

    }
    public static int isLargest(int a,int b,int c){
        int large =a;
        if(large<b){
            large=b;
        }
        if(large<c){
            large=c;
        }
        return large;
    }
}
