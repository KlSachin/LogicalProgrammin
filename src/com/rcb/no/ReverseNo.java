package com.rcb.no;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no:");
        int n =sc.nextInt();
        int rev =0;
        while (n!=0){
            int d =n%10;
            rev =rev*10+d;
            n /=10;
        }
        System.out.println(rev);
    }
}
