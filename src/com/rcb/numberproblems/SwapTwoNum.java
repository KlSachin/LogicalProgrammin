package com.rcb.numberproblems;

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the num to a :");
        int a =sc.nextInt();
        System.out.println("enter the num to b :");
        int b =sc.nextInt();


//using temp variable
            int temp =a;
            a=b;
            b =temp;


//          a =a+b;
//          b=a-b;
//          a=a-b;
//        System.out.println("after swapping :");
        System.out.println("value of a is :"+a);
        System.out.println("value of b is :"+b);
    }
}
