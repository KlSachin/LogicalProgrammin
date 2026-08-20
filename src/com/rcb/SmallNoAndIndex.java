package com.rcb;

public class SmallNoAndIndex {
    public static void main(String[] args) {
        int [] arr={22,3,4,5,67,78,55};
        smallAndIndex(arr);
    }
    public static void smallAndIndex(int [] arr){
        int small=arr[0];
        int index =0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<small){
                small =arr[i];
                index =i;
            }
        }
        System.out.println("small element is:"+small);
        System.out.println("small element index is:"+index);

    }
}
