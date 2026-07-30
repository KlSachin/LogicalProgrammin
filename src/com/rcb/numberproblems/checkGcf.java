package com.rcb.numberproblems;

import java.util.Scanner;

public class checkGcf {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enteer the no 1 :");
        int a =sc.nextInt();
        System.out.println("enter the no 2:");
        int b=sc.nextInt();

        System.out.println(isGcf(a,b));




    }
    public static int isGcf(int a,int b){
        int small = (a>b)?b:a;
        int res=1;
        for(int i =1;i<=small;i++){
            if( a%i==0 && b%i==0){
                res=i;
            }

        }
        return res;
    }
}
