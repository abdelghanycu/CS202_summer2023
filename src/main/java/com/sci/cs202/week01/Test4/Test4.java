package com.sci.cs202.week01.Test4;

public class Test4 {

  public static void main(String[] args) {

//    Shape x = new Shape() {
//      @Override
//      public double area() {
//        return 5;
//      }
//
//      @Override
//      public double perimeter() {
//        return 6;
//      }
//    };
//
//    System.out.println(x.area());
//    System.out.println(x.perimeter());
//
//    Shape[] shapes = new Shape[3];
//
//    shapes[0] = new Circle(5);
//    shapes[1] = new Square(2);
//    shapes[2] = new Circle(3);
//
//    for (int i = 0; i < 3; i++) {
//      if (shapes[i] instanceof Square) {
//        System.out.println("This shape is square");
//      } else if (shapes[i] instanceof Circle) {
//        System.out.println("This shape is circle");
//      }
//      System.out.println(shapes[i].area());
//      System.out.println(shapes[i].perimeter());
//      System.out.println("*****");
//    }

//    Shape c1 = new Circle(5);
//
//    System.out.println(c1.area());
//    System.out.println(c1.perimeter());

//    Work ob = new Work();
//    System.out.println(ob.sum(5, 4));
    System.out.println(Work.sum(5, 4));
  }
}

final class Work {

  private Work(){
  }

  public static int sum(int a, int b) {
    return a + b;
  }
}
interface Shape {

  double area();

  double perimeter();
}

class Square implements Shape {

  private double length;

  public Square() {

  }

  public Square(double length) {
    this.length = length;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  @Override
  public double area() {
    return length * length;
  }

  @Override
  public double perimeter() {
    return length * 4;
  }
}

class Circle implements Shape {

  private double radius;

  public Circle() {

  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }

  @Override
  public double perimeter() {
    return Math.PI * radius * 2;
  }
}