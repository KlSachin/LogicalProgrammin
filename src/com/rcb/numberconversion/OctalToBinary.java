package com.rcb.numberconversion;

import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner  sc= new Scanner(System.in);
        System.out.println("enter the no ");
        int n =sc.nextInt();

        long count=0;
        long sum=0;
        while (n>0){
            long d =n%2;
            sum=sum + d * (int)Math.pow(8,count);
            count++;
            n/=2;
        }
        System.out.println("octal to decimal:"+sum);
        int cou=0;
        String binary ="";
        while(sum>0){
            int d =n%10;

            binary=binary+d*Math.pow(2,cou);
            sum=sum/10;

        }
        System.out.println("decimal to binary:"+binary);

    }

}
