package Weeks14.generic;

import Weeks8_2.polymorphism.Professor;
import Weeks8_2.polymorphism.Student;

public class GenericTest2 {
  public static void main(String[] args) {
    // GenericPair 클래스 객체 2개를 생성해서 값을 넣고 빼고 해보세요
    GenericPair<Professor, Student> box1 = new GenericPair<Professor, Student>(new Professor("박성철"),
        new Student("박수헌", "컴정"));
    Professor prof = box1.getKey();
    Student std = box1.getValue();

    System.out.println(std.getName() + "의 학과는 " + std.getStdNum() + " 이고, 지도교수는 "
        + prof.getName() + " 교수님 입니다.");

    // Generic 클래스의 타입 파라미터 값으로는 반드시 참조형 타입이 와야 한다
    // 기초자료형(primitive type)은 절대 올 수 없다.
    // GenericPair<String, int> box2 = new GenericPair<String, int>("고길동", 30);
    // 타입 파라미터로 기초자료형의 배열은 올 수 있나? 가능하다
    int[] jumsus = { 90, 87, 88, 79, 93 };
    GenericPair<String, int[]> gp3 = new GenericPair<String, int[]>("1조 점수", jumsus);
    
  }
}

enum Gender {
  MALE, FEMALE;
}