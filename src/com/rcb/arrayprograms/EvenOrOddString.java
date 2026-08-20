package com.rcb.arrayprograms;

public class EvenOrOddString {
    public static void main(String[] args) {
      String n ="123456789";
      int len =n.length();
      String res ="";
      while(len>0){
         char ch =n.charAt(len-1);
         if(ch%2==0){
             res =ch+res;
         }
         len--;

      }
        System.out.println(res);
    }

}
