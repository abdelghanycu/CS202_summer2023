package com.sci.cs202.week04.test02;



public class QueueBox {


    int value;
    QueueBox next;
    QueueBox previous;

    public QueueBox(int value, QueueBox next, QueueBox previous) {
      this.value = value;
      this.next = next;
      this.previous = previous;
    }
  }

