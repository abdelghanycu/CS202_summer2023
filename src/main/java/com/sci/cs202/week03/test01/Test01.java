package com.sci.cs202.week03.test01;

public class Test01 {

  public static void main(String[] args) {
    LinkedBox linkedBox = new LinkedBox();
    linkedBox.addLast(15);
    linkedBox.addLast(4);
    linkedBox.removeFirst();
    linkedBox.addLast(7);
    linkedBox.addFirst(5);
    System.out.println(linkedBox.getFirst());
    System.out.println(linkedBox.getLast());
    linkedBox.addLast(29);
    linkedBox.addLast(13);
    linkedBox.removeFirst();
    linkedBox.addFirst(3);
    linkedBox.removeLast();
    linkedBox.print();

    System.out.println();
  }
}


class LinkedBox {

  Box head;
  Box tail;
  int sz;

  public LinkedBox() {
  }

  public void addLast(int element) {
    if (sz == 0) {
      head = tail = new Box(element, null, null);
    } else {
      Box newBox = new Box(element, null, tail);
      tail.next = newBox;
      tail = newBox;
    }
    sz++;
  }

  public void addFirst(int element) {
    if (sz == 0) {
      head = tail = new Box(element, null, null);
    } else {
      Box newBox = new Box(element, head, null);
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

  public void print() {
//    for ( Box current=head ; current!=null ; current=current.next){
//      System.out.println(current.value);
//
//    }
    Box current = head;
    while (current != null) {
      System.out.println(current.value);
      current = current.next;
    }

  }

  public int get(int idx) {
    return 0;
  }
}

class Box {

  int value;
  Box next;
  Box previous;

  public Box(int value, Box next, Box previous) {
    this.value = value;
    this.next = next;
    this.previous = previous;
  }
}