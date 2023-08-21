package com.sci.cs202.week04.test01;

public class StackImp {

  StackBox head;
  StackBox tail;
  int sz;

  public StackImp() {
  }

  public void push(int element) {
    if (sz == 0) {
      head = tail = new StackBox(element, null, null);
    } else {
      StackBox newBox = new StackBox(element, null, tail);
      tail.next = newBox;
      tail = newBox;
    }
    sz++;
  }

  public int peek() {
    return tail.value;
  }

  public void pop() {
    if (sz < 2) {
      head = tail = null;
      sz = 0;
    } else {
      tail = tail.previous;
      tail.next = null;
    }
  }
}
