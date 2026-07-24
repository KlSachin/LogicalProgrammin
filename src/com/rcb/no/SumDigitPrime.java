package com.rcb.no;

import java.util.Scanner;

public class SumDigitPrime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no :");
        int n = sc.nextInt();
        int sum =0;
        while(n!=0){
            int d =n%10;
            sum=sum+d;
            n/=10;

        }
        int count=0;
      for(int i =2;i<sum/2;i++){
          if(sum%i==0){
              count++;
          }
      }
      if(count==0){
          System.out.println(sum+" is a prime no");
      }
      else{
          System.out.println(sum+" is not a prime no");
      }
    }
}
