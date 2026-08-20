package com.rcb.arrayprograms;

public class BigAndSmallArrEle {
    public static void main(String[] args) {
        int []arr ={12,45,6,7,311};

        System.out.println(  diffInBigAndSmall(arr));
    }
    public static int diffInBigAndSmall(int [] arr){
        int max =arr[0];
        int small =arr[0];
        int diff =0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<small){
                small=arr[i];
            }
        }
        diff =max-small;
        return diff;
    }
}
