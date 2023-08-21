package com.sci.cs202.week02.test03;

public class Test1 {

  public static int bs(int[] arr, int k) {
    int st = 0;
    int ed = arr.length - 1;
    while (st <= ed) {
      int mid = (st + ed) / 2;
      if (arr[mid] == k) {
        return mid;
      } else if (arr[mid] > k) {
        ed = mid - 1;
      } else {
        st = mid + 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
//    m1(new int[]{1, 1, 4, 55, 77 ,77, 55, 78 ,79, 1});
//    m1(new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5});
    System.out.println(bs(new int[]{1, 4, 7, 8, 44, 45, 49, 50, 53}, 53));
  }

  public static void m1(int[] arr) {
    boolean[] vis = new boolean[100];
    for (int i = 0; i < arr.length; i++) {
      int num = arr[i];
      int cnt = 0;
      if (vis[num]) {
        continue;
      }
      vis[num] = true;
      for (int j = 0; j < arr.length; j++) {
        if (arr[j] == num) {
          cnt++;
        }
      }
      System.out.println("number " + num + " has " + cnt);
    }
  }

  public static int max(int[] arr) {
    int maxValue = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (maxValue < arr[i]) {
        maxValue = arr[i];
      }
    }
    return maxValue;
  }
}
