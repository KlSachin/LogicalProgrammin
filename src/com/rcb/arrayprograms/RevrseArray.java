package com.rcb.arrayprograms;

import java.util.Arrays;
import java.util.Scanner;

public class RevrseArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size :");
        int n =sc.nextInt();
        System.out.println("array elements are :");
        int[] arr =new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void reverse(int [] arr){
        int i =0;
        int j =arr.length-1;
        while(i<j){


            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
}
