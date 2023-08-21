package com.sci.cs202.week01;

import java.util.Scanner;

public class Test1 {

  public static void main(String[] args) {

    if(args != null) {
      System.out.println(args.length);
      System.out.println(args[0]);
    }
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    String[] names = new String[n];
    int[] codes = new int[n];
    String[] address = new String[n];
    int[] ages = new int[n];

    for (int i = 0; i < n; i++) {
      names[i] = sc.next();
      codes[i] = sc.nextInt();
      address[i] = sc.next();
      ages[i] = sc.nextInt();
    }

    islam(3);
  }

  public static double islam(int x) {
    return 5.6 * 1.5;
  }
}
