package com.sci.cs202.week01.test2;

import java.util.Scanner;

public class Test2 {

  public static void main(String[] args) {

    Math.random();

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    Student[] students = new Student[n];

    for (int i = 0; i < n; i++) {
      String name = sc.next();
      int code = sc.nextInt();
      String address = sc.next();
      int age = sc.nextInt();

      students[i] = new Student(name, code, address, age);
      students[i].count++;
    }

    Student s1 = new Student("ali", 12, "giza", 12);
    s1.count++;
    Student s2 = new Student("ahmed", 13, "cairo", 19);
    s2.count++;
    Student s3 = new Student("eman", 14, "giza", 16);
    s3.count++;

    System.out.println(s1.count);
    System.out.println(s2.count);
    System.out.println(s3.count);

    System.out.println(Student.count);


  }
}

class Student {

  private String name;
  private int code;
  private String address;
  private int age;

  static int count = 0;

  public String getName(){
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge(){
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Student(){

  }

  public Student(String name, int code, String address, int age) {
    this.name = name;
    this.code = code;
    this.address = address;
    this.age = age;
  }
}