package com.rcb.numberconversion;

import java.util.Scanner;

public class HexaDecimal {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the Strong:");
        String str =sc.next();
        System.out.println(isHexa(str));
    }
    public static int isHexa(String s){
        int resu =0;
        int count=0;
        int r=0;
        int Len =s.length();
        while (Len>0){
            char ch=s.charAt(Len-1);

            if(ch>=65 && ch<=70){
                r=ch-55;
            } else if (ch>=97 && ch<=102){
                r=ch-87;
            }
            else{
                r=ch-48;
            }
            resu =resu+r*(int)Math.pow(16,count);
            count++;
            Len--;
        }
        return resu;
    }
}
