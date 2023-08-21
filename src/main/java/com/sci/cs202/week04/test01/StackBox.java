package com.sci.cs202.week04.test01;

public class StackBox {

  int value;
  StackBox next;
  StackBox previous;

  public StackBox(int value, StackBox next, StackBox previous) {
    this.value = value;
    this.next = next;
    this.previous = previous;
  }
}
