package com.rcb.numberproblems;

import java.util.Scanner;

public class SwapFirstLast {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no :");
        int n =sc.nextInt();
int original =n;
int last =n%10;
int count=0;
while(n>0){
    count++;
    n/=10;
}

int divisor=1;
for(int i =1;i<count;i++){
    divisor=divisor*10;
}

int first=original/divisor;

int middle =(original%divisor)/10;

        int result =last*divisor + middle*10+first;

        System.out.println(result);

    }
}
