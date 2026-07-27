package com.rcb.numberproblems;

import java.util.Scanner;

public class TechNo {
    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no :");
        int n =sc.nextInt();

        int original =n;
      int count = (""+n).length();
        System.out.println(count);

        int div =1;
        for(int i=1;i<=count/2;i++){
            div =div*10;
        }

        int firstHalf = original/div;
        int lastHalf =original%div;
         int sum =0;
         sum =firstHalf+lastHalf;

        if(sum* sum ==original){
            System.out.println(original+"is a tech no");
        }
        else {
            System.out.println(original+"not a tech no");
        }

    }
}
