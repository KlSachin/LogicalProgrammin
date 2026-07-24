package com.rcb.no;

import java.util.Scanner;

public class CheckEligible {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        System.out.println("enter your name :");
        String name =sc.next();
        System.out.println("enter your age :");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println(name+" your are eligible to vote");
        }
        else{
            System.out.println(name+" your are not eligible to vote");
        }
    }
}
