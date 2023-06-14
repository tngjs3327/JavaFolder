package Weeks15.generic;

public class Student implements Comparable<Student> {
  String name;
  int grade;

  public Student(String name, int grade) {
    this.name = name;
    this.grade = grade;
  }

  // @Override
  // public int compareTo(Student o) {
  // // 이 객체의 어떤 값과 인자로 전달받은 o 객체의 어떤 값을 비교해서
  // // 나의 값이 더 크면 양수, 같으면 0, 더 작으면 음수를 반환하도록 구현하면 된다
  // return (this.grade - o.grade);
  // }

  // 학생객체를 이름의 사전순으로 정렬하도록 compareTo 메서드를 구현하라
  @Override
  public int compareTo(Student o) {
    // return this.name.compareTo(o.name); // 오름차순
    return -(this.name.compareTo(o.name)); // 내림차순
  }
}
