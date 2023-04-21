package Weeks8_2.interfaceTest;

import Weeks8_2.polymorphism.Util;

public class Test {
  public static void main(String[] args) {
    // String s1 = "BBC";
    // String s2 = "BBC";

    // System.out.println(s1.compareTo(s2));

    // Student std1 = new Student("일지매", "컴정");
    // Student std2 = new Student("홍길동", "컴정");

    // findLarger(std1, std2);

    // Car c1 = new Car("Mercedes-Benz", "S-Class", 200, 7000);
    // Car c2 = new Car("Rolls-Royce", "컬리넌", 300, 10000);
    // Car c3 = new Car();
    // System.out.println(c1);
    // System.out.println(c2);
    // System.out.println(c3);

    // findLarger(c1, c2);

    // Student[] stds = new Student[5];
    // stds[0] = new Student("일지매", "컴정");
    // stds[1] = new Student("홍길동", "컴정");
    // stds[2] = new Student("김일곤", "컴정");
    // stds[3] = new Student("박수헌", "컴정");
    // stds[4] = new Student("박정민", "컴정");

    // Util.selectionSort(stds, false);

    // for (Student std : stds) {
    // System.out.println(std.getName());
    // }

    Car[] cars = new Car[5];

    cars[0] = new Car("Mercedes-Benz", "S-Class", 200, 7000);
    cars[1] = new Car("Rolls-Royce", "컬리넌", 300, 10000);
    cars[2] = new Car("GM", "Impala", 300, 4000);
    cars[3] = new Car("KIA", "K9", 300, 6000);
    cars[4] = new Car("HyunDai", "Sonata", 300, 4500);

    Util.selectionSort(cars, false);

    for (Car car : cars) {
      System.out.println(car);
    }

  }

  // Comparable 인터페이스를 구현했다면 사용할 수 있다
  public static void findLarger(Comparable c1, Comparable c2) {
    if (c1.compareTo(c2) == 0) {
      System.out.println("같다");
    } else if (c1.compareTo(c2) > 0) {
      System.out.println("첫번째가 크다");
    } else {
      System.out.println("두번째가 크다");
    }
  }

}
