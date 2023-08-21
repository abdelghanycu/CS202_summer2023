package com.sci.cs202.week02.test02;

public class Test1 {

  public static int convert(String str) {
    int  value = 0;
    for(int i = 0; i < str.length() ;i++) {
      value *= 10;
      value += str.charAt(i) - '0';
    }
    return value;
  }

  public static void main(String[] args) {
//    String s = "abcdsz";
//    char ch = s.charAt(0);
//    System.out.println(ch);
//    System.out.println((int)ch - '0');
//    int x = 'a' + 3;
//    System.out.println(x);
    String s = "1245z";
//    System.out.println("convert the string 1245 to integer : " + convert(s));
    System.out.println(Integer.parseInt(s));
  }
}
