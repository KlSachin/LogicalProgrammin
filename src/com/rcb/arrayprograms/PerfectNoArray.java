package com.rcb.arrayprograms;

import java.util.Scanner;

public class PerfectNoArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array size :");
        int n =sc.nextInt();


        int[] arr =new int[n];
        System.out.println("array elements are:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j =1;j<arr[i];j++){
                if(arr[i]%j==0){
                    count+=j;
                }
            }
            if(count==arr[i]){
                System.out.println(arr[i]);
            }
        }



    }
}
