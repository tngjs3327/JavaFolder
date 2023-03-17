package Weeks3_1;

public class StudentTest {
  public static void main(String[] args) {
    Student obj1 = new Student();
    System.out.println(obj1.toString());

    Student obj2 = new Student("홍길동", 2002, "컴정", "칠곡");
    System.out.println(obj2.toString());
  }
}
