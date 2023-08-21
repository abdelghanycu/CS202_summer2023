package com.sci.cs202.week02.test01;

public class Test1 {

  public static void m1(int x) {
    x = 17;
  }

  public static void m2(int[] x) {
    x[0] = -1;
  }

  public static void m3(Student s) {
    System.out.println("************");
    System.out.println(s.name + " " + s.code);
    s.name = "3atres";
    System.out.println(s.name + " " + s.code);
    System.out.println("************");
  }

  public static void main(String[] args) throws CloneNotSupportedException {

    Student s0 = new Student(5, "abdelghany");
//    m3(new Student(s0.code, s0.name));
    m3((Student) s0.clone());

    System.out.println(s0.name);

//    int value = 3;
//    m1(value);
//    System.out.println("here value from main " + value);
//    int arr[] = {50, 5, 4};
//    m2(arr);
//    System.out.println("the array after calling m2 arr[0]=" + arr[0]);


//    Integer x = new Integer(5);
//    Integer y = new Integer(3);
//    List<Integer> list = new ArrayList<>();
//    list.add(16);
//    list.add(18);
//    list.add(1);
//    list.add(3);
//    list.add(8);
//    Collections.sort(list);
//    System.out.println();

//    List<Student> std = new ArrayList<>();
//    std.add(new Student(7, "mohamed"));
//    std.add(new Student(5, "ali"));
//    std.add(new Student(19, "mona"));
//    std.add(new Student(3, "ahmed"));
//
//    Collections.sort(std);
//
//
//    for(Student s : std) {
//      System.out.println(s.code + " " + s.name);
//    }

//    Student x1 = new Student(5, "abdelghany");
//    Student x2 = new Student(7, "sara");
//
//    System.out.println(x1.compareTo(x2));
  }
}

class Student implements Comparable<Student>, Cloneable {

  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
  int code;
  String name;

  public Student(int code, String name) {
    this.code = code;
    this.name = name;
  }

  @Override
  public int compareTo(Student o) {
    return this.name.compareTo(o.name);
//    int len1 = this.name.length();
//    int len2 = o.name.length();
//    for(int i = 0; i < Math.min(len1, len2); i++) {
//      if(this.name.charAt(i) - o.name.charAt(i) > 0) {
//        return 1;
//      }else if(this.name.charAt(i) - o.name.charAt(i) < 0) {
//        return -1;
//      }
//    }
//    if(len1 == len2) return 0;
//    if(len1 > len2) return -1;
//    return 1;
  }
}
