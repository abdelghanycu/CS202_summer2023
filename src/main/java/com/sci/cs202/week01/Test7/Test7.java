package com.sci.cs202.week01.Test7;

public class Test7 {

  public static void main(String[] args) {
    try {
      int[] arr = new int[10];
      System.out.println(arr[11]);
      int x = 5;
      int y = 0;
      if (y == 0) {
        System.out.println("can not be divided");
      } else {
        System.out.println(x / y);
      }
    } catch (ArithmeticException ex) {
      System.out.println("exception happened ArithmeticException");
    }
    catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("exception happened ArrayIndexOutOfBoundsException");
    }

//    Scanner sc = null;
//    try {
//       sc = new Scanner(new File("C:\\Users\\Abdelghany\\Downloads\\test.txt"));
//      System.out.println(sc.next());
//    } catch (FileNotFoundException e) {
//      System.out.println("exception happened FileNotFoundException");
//    }finally {
//      System.out.println("here");
//      if(sc != null) {
//        sc.close();
//      }
//
//    }
  }
}
