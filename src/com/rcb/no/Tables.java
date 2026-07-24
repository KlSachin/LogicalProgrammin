package com.rcb.no;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Tables.mainMethod();
    }

    public static void mainMethod() {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number:- ");
        int n =sc.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i+";");
        }

    }
}
