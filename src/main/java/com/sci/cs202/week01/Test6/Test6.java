package com.sci.cs202.week01.Test6;

public class Test6 {

  public static void main(String[] args) {
    String s1 = new String("abdelghany");
    String s2 = new String("abdelghany");

    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));

    System.out.println("***********************");

    Work x1 = new Work();
    x1.val = 5;
    Work x2 = new Work();
    x2.val = 5;

    System.out.println(x1 == x2);
    System.out.println(x1.equals(x2));
  }
}

class Work {
  int val;

  public boolean equals(Object ob) {
    return val == ((Work)(ob)).val;
  }
}