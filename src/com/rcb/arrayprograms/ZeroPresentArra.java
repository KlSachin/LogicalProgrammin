package com.rcb.arrayprograms;

import java.util.Scanner;

public class ZeroPresentArra {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array size :");
        int n =sc.nextInt();


        int[] arr =new int[n];
        System.out.println("array elements are:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
