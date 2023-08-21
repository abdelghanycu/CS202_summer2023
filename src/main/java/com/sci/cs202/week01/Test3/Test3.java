package com.sci.cs202.week01.Test3;

public class Test3 {

  public static void main(String[] args) {


    Person[] persons = new Person[5];

    persons[0] = new Person("ahil", "giza", 15);
    persons[1] = new Student("ahmed", "giza", 15, 12, 1);
    persons[2] = new Employee("Mohamed", "giza", 15, 4000, 30);
    persons[3] = new Employee("eman", "giza", 15, 5000, 4);
    persons[4] = new Student("hager", "giza", 15, 13, 16);

    for (int i = 0; i < 5; i++) {
      persons[i].print();
    }


//    Person s1 = new Student("ali", "giza", 12, 12, 1);
//
//    s1.print();
//    ((Student)(s1)).print();
//
//    Employee e1 = new Employee("ahmed", "giza", 14, 4000, 30);
//
//    Person p1 = new Person("alla", "giza", 16);

//    System.out.println(p1.hashCode());
//    System.out.println(p1.getClass().getName());
//    System.out.println(Integer.toHexString(p1.hashCode()));
//
//    System.out.println("******************");
//    System.out.println(p1.toString());
//    System.out.println(p1.getClass().getName() + "@" + Integer.toHexString(p1.hashCode()));
  }
}

class Person extends Object {

  protected String name;
  private String address;
  private int age;

  @Override
  public String toString() {
    return "I'm el7ag person";
  }

  public void print() {
    System.out.println("here i'm print from person class");
  }

  public Person() {

  }

  public Person(String name, String address, int age) {
    this.name = name;
    this.address = address;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

class Employee extends Person {

  private int salary;
  private int vacation;

//  @Override
  public void print() {
    System.out.println("here i'm print from employee class");
  }

  public Employee() {
  }

  public Employee(String name, String address, int age, int salary, int vacation) {
    super(name, address, age);
    this.salary = salary;
    this.vacation = vacation;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public int getVacation() {
    return vacation;
  }

  public void setVacation(int vacation) {
    this.vacation = vacation;
  }
}

class Student extends Person {

  private int code;
  private int level;

//  @Override
  public void print() {
    System.out.println("here i'm print from student class");
  }

  public Student() {

  }

  public Student(String name, String address, int age, int code, int level) {
    super(name, address, age);
    this.code = code;
    this.level = level;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }
}


