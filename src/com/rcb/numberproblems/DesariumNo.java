package com.rcb.numberproblems;

import java.util.Scanner;

public class DesariumNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the no :");
        int n =sc.nextInt();
        isDesarium(n);
    }
    public static void isDesarium(int n){
       int real = n;
        int original =n;
      int count=0;
        while(n>0){
            int d=n%10;
            count++;
            n=n/10;
        }
         n =real;
        int sum =0;
while (n>0){

    int m =n%10;
    int pow=1;
    for(int i =1;i<=count;i++){
        pow =pow*m;

    }
     sum =sum+pow;
    count--;
    n =n/10;

}
if(original == sum){
    System.out.println(original+" is a disarium no");
}
else{
    System.out.println(original +" is not a disarium no");
}

    }
}
