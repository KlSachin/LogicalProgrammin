package com.rcb.patterns;

public class InvertedHalfNum {
  public static void main(String[] args) {
      int n =5;
      // int Number =1;
      for (int i = 1; i <=n; i++) {
        for (int j = 1; j<=n-i+1; j++) {     
          System.out.print(" "+j);
            
        }
          System.out.println();
      }

  }
}
