package com.rcb.numberproblems;

import java.util.Scanner;

public class PrimePalindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the start no :");
        int i =sc.nextInt();
        System.out.println("enter the end no :");
        int n =sc.nextInt();
        System.out.println("prime palendrome no are :");
for (int start=i;i<=n;i++) {
    if (isPrime(i) == 2 && isPalindrome(i) == i) {
        System.out.println(i + " is a prime palindrome");
    }
}
        ;
        ;


    }
    public static int isPrime(int n) {

int count=0;
        for (int i = 1; i <= n; i++) {
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
