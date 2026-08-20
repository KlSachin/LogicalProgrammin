package com.rcb.arrayprograms;

import java.util.Scanner;

public class CountPosAndNegArr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array size :");
        int n =sc.nextInt();

        int[] arr = new int[n];
        System.out.println("the array elements are :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
int positive=0;
        int negative =0;
 for(int i=0;i<arr.length;i++){
     if(arr[i]>0){
         positive++;
     }
     else {
         negative++;
     }
 }
        System.out.println("positive no are :"+positive);
        System.out.println("negative no are :"+negative);
    }
}
