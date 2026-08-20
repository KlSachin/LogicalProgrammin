package com.rcb.arrayprograms;

import java.util.Scanner;

public class SumOfEvenOrOddArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array size :");

        int n =sc.nextInt();

        int[] arr = new int[n];
        System.out.println("array elements are");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();


            }
        int EvenSum= 0;
        int OddSum =0;
        for(int i =0;i<arr.length;i++){
          if(arr[i]%2==0){
              EvenSum+=arr[i];
          }
          else {
              OddSum+=arr[i];
          }
        }
        System.out.println(EvenSum);
        System.out.println(OddSum);

    }
}
