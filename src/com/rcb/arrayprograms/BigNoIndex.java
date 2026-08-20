package com.rcb.arrayprograms;

public class BigNoIndex {
    public static void main(String[] args) {

        int [] arr ={34,56,78,32,99,1};
        System.out.println(bigIndex(arr));
    }
    public static int bigIndex(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max =i;
            }
        }
        return max;
    }
}
