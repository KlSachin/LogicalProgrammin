package com.rcb.no;

public class PalindromeOrNot {
    public static void main(String[] args) {

        System.out.println("palindrome no are :");
        for(int i =100;i<=1000;i++){
            int num =i;
            int rev=0;
           while(num>0){
               int d =num%10;
               rev =rev*10+d;
          num/=10;
        }

           if(i==rev){
               System.out.println(i);
           }
      }
    }
}
