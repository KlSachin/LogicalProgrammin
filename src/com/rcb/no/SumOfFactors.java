package com.rcb.no;

import java.util.Scanner;

public class SumOfFactors {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n =sc.nextInt();

        int sum =0;
        for(int i =1;i<=n/2;i++){
            if(n%i==0){
              sum =sum+i;
            }
        }
        System.out.println("sum of factors is :"+sum);
        if(sum ==n){
            System.out.println(n+" is a perfect no");
        }
        else {
            System.out.println(n+"is  not a perfect no");
        }

    }
}
