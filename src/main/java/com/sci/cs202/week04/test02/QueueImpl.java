package com.sci.cs202.week04.test02;


public class QueueImpl {

  QueueBox head;
  QueueBox tail;
  int sz;
  public void enQueue(int element) {
    if (sz == 0) {
      head = tail = new QueueBox(element, null, null);
    } else {
      QueueBox newBox = new QueueBox(element, null, tail);
      tail.next = newBox;
      tail = newBox;
    }
    sz++;
  }
  public int front() {
    return head.value;
  }
  public void deQueue() {
    if (sz > 0) {
      head = head.next;
      head.previous = null;
      sz--;
    }
  }
}
