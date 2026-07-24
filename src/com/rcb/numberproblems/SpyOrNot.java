package com.rcb.numberproblems;

import java.util.Scanner;

public class SpyOrNot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no :");
        int n =sc.nextInt();
        System.out.println(isSum(n));
        System.out.println(isProduct(n));
        int original =n;
        if(isProduct(n) == isSum(n)){
            System.out.println(original+" is a spy no");
        }
        else{
            System.out.println(original+" is not a spy no");
        }
    }
    public static int isSum(int n){
        int sum =0;
        while(n>0){
            int d =n%10;
            sum=sum+d;
            n =n/10;
        }
      return sum;
    }
    public static int isProduct(int n){
        int product =1;
        while (n>0){
            int d =n%10;
            product =product*d;
            n=n/10;
        }
        return product;
    }
}
