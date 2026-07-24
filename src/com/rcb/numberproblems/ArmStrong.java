package com.rcb.numberproblems;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no :");
        int n = sc.nextInt();
        int original =n;
        int count=0;
        int sum =0;
        while (n>0) {
            count++;
            n = n / 10;
        }

        n =original;
        while(n>0) {
            int d = n % 10;
            int r = 1;
            for (int i = 1; i <= count; i++) {
                r = d * r;
            }
            sum=sum+r;
            n=n/10;
        }

        System.out.println(sum);

        if(original==sum){
            System.out.println(original+" is a armStrong no");
        }
        else {
            System.out.println(original+" is not a armStrong no");
        }
sc.close();
    }
}
