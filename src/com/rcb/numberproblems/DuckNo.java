package com.rcb.numberproblems;

import java.util.Scanner;

public class DuckNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no :");
        int n =sc.nextInt();
        isDuck(n);

    }
    public static void isDuck(int n){
         boolean duck =false;
         int original=n;
        while(n>0){
            int d =n%10;
           if(d==0){
              duck =true;
           }
           n=n/10;
        }
        System.out.println(original+" is not a duck");
    }

}
