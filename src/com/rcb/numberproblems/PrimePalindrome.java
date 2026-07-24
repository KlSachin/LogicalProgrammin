package com.rcb.numberproblems;

import java.util.Scanner;

public class PrimePalindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no :");
        int n =sc.nextInt();


        if(isPrime(n)==0 &&  isPalindrome(n)==n){
            System.out.println(n+" is a prime palindrome");
        }
        else {
            System.out.println(n+" is not a prime palindrome");
        }
        ;
        ;


    }
    public static int isPrime(int n) {

        if (n < 2) {
            return 1;
        }

        int count = 0;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return count;
    }

    public  static int isPalindrome(int n){
        int original =n;
        int rev =0;
        while(n >0){

            int d =n%10;
            rev =rev*10+d;
            n=n/10;
        }


        return rev;
    }

}
