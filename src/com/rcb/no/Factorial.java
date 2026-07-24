package com.rcb.no;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(Factorial.getFactorial());

    }
    public static int getFactorial(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number :");
        int n =sc.nextInt();
        int fact =1;
        for(int i=1;i<=n;i++){
          fact *=i;
        }
        return fact;
    }
}
