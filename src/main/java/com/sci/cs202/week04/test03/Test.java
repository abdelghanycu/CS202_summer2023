package com.sci.cs202.week04.test03;

public class Test {

  public static void main(String[] args) {
    PositionLinkedNode list = new PositionLinkedNode();
    list.addFirst(5);
    list.addLast(7);
    list.addLast(9);
    PositionNode positionNode = list.addFirst(10);
    list.addFirst(16);
    list.addLast(19);

    list.set(45, positionNode);
  }
}
