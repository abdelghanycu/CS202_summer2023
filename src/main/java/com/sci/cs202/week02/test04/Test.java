package com.sci.cs202.week02.test04;

public class Test {

  public static void main(String[] args) {

//    Scanner in = new Scanner(System.in);

//    int n = in.nextInt();

//    int[] arr = new int[10000];
//
//    int idx = 0;
//    while (true) {
//      int x = in.nextInt();
//      if(x == -1){
//        break;
//      }
//      arr[idx] = x;
//      idx++;
//    }
//
//    ArrayList

    ArrayList2 list = new ArrayList2();

    list.add(5);
    list.add(7);
    list.add(9);
    list.add(1);
    list.add(3);

    for(int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

  }
}


class ArrayList2 {

  private int data[];
  private int sz;
  private int cap;

  ArrayList2() {
    sz = 0;
    cap = 1;
    data = new int[cap];
  }

  ArrayList2(int cap) {
    sz = 0;
    this.cap = cap;
    data = new int[cap];
  }

  int size() {
    return sz;
  }

  void add(int ele) {
    if(sz == cap) {
      copy();
    }
    data[sz++] = ele;
  }

  int get(int idx) {
    return data[idx];
  }

  private void copy() {
    cap = cap * 2;
    int[] tmp = new int[cap];
    for(int i = 0; i < data.length; i++) {
      tmp[i] = data[i];
    }
    data = tmp;
  }

  void remove(int idx) {
    for(int i = idx + 1; i < sz; i++) {
      data[i-1] = data[i];
    }
    sz--;
  }

}