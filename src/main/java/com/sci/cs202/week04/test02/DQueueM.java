package com.sci.cs202.week04.test02;
public class DQueueM {
  Node head;
  Node tail;
  int sz;

  public DQueueM() {
  }

  public void addLast(int element) {
    if (sz == 0) {
      head = tail = new Node(element, null, null);
    } else {
      Node newBox = new Node(element, null, tail);
      tail.next = newBox;
      tail = newBox;
    }
    sz++;
  }

  public void addFirst(int element) {
    if (sz == 0) {
      head = tail = new Node(element, null, null);
    } else {
      Node newBox = new Node(element, head, null);
      head.previous = newBox;
      head = newBox;
    }
    sz++;
  }

  public int getFirst() {
    return head.value;
  }

  public int getLast() {
    return tail.value;
  }

  public void removeFirst() {
    if (sz > 0) {
      head = head.next;
      head.previous = null;
      sz--;
    }
  }

  public void removeLast() {
    if (sz < 2) {
      head = tail = null;
      sz = 0;
    } else {
//      Box current = head;
//      while (current.next.next != null) {
//        current = current.next;
//      }
//      tail = current;
//      tail.next = null;
//      sz--;
      tail = tail.previous;
      tail.next =null;
    }
  }


}
