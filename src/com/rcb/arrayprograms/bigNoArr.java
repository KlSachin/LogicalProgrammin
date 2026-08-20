package com.rcb.arrayprograms;

public class bigNoArr {
    public static void main(String[] args) {
        int [] arr ={23,45,67,98,01};

//
        System.out.println("big no in array is :"+biggestArr(arr));
    }
    public static int biggestArr(int [] arr){
        int max =arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }
}
