package com.sci.cs202.week04.test03;

import com.sci.cs202.week04.test02.Node;

public class PositionNode {

  int value;
  PositionNode previous;
  PositionNode next;

  public PositionNode(int value, PositionNode previous, PositionNode next) {
    this.value = value;
    this.next = next;
    this.previous = previous;
  }
}
