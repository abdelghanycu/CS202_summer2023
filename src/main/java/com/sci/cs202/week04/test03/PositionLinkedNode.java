package com.sci.cs202.week04.test03;

public class PositionLinkedNode {

  PositionNode head;
  PositionNode tail;
  int sz;

  public PositionLinkedNode() {
    head = new PositionNode(-1, null, null);
    tail = new PositionNode(-1, null, null);
    head.next = tail;
    tail.previous = head;
  }

  public int size() {
    return sz;
  }

  private PositionNode addBetween(int element, PositionNode first, PositionNode second) {
    PositionNode newNode = new PositionNode(element, first, second);
    first.next = newNode;
    second.previous = newNode;
    sz++;
    return newNode;
  }

  public PositionNode addFirst(int element) {
    return addBetween(element, head, head.next);
  }

  public PositionNode addLast(int element) {
    return addBetween(element, tail.previous, tail);
  }

  public PositionNode set(int element, PositionNode position) {
    return addBetween(element, position.previous, position);
  }

  public int getFirst() {
    return head.next.value;
  }
}
