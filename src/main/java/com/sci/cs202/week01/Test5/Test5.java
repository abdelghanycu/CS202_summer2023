package com.sci.cs202.week01.Test5;

import java.util.Arrays;

public class Test5 {


  public static void main(String[] args) {

    int[] arr = {11, 9, 7, 5, 4, 7, 1, 2};

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println("**********");

    Arrays.sort(arr);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

//    int var = 10;
//    m1(var);
//    System.out.println("Var after calling m1 is " + var);
    Transporter z = new Transporter();
    z.name = "ali";
    z.id = 1;
    System.out.println("before calling m2");
    System.out.println(z.name + " " + z.id);
    m2(z);
    System.out.println("after calling m2");
    System.out.println(z.name + " " + z.id);
  }

  public static void m1(int x) {
    x = 15;
    x = x * 17;
    System.out.println("end the method m1");
  }

  public static void m2(Transporter t) {
    t.id = 17;
    t.name = "abdelghany";
  }

}

class Transporter {

  String name;
  int id;
}