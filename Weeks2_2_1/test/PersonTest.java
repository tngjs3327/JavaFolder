package Weeks2_2_1.test;

public class PersonTest {
  public static void main(String[] args) {
    Person p = new Person();
    // p.name = "홍길동";
    // p.age = 23;

    // p.age = -100; // 일부 사용자가 이상한 값을 줄 수 있다
    // java에서는 기본적으로 멤버 변수에는 private를 적용하자

    p.setAge(-20);
    System.out.println(p.getAge());

    System.out.println(p.getName());
    System.out.println(p.getDept());

  }
}
