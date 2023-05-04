package Weeks10_1.interfaceTest;

import Weeks8_2.polymorphism.Student;

public class AnonymousTest {
  public static void main(String[] args) {
    RemoteControl rt1 = new SamsungTv();
    rt1.turnOff();

    RemoteControl rt2 = new LgTv();
    rt2.turnOn();

    // 무명 클래스로 SonyTv 객체를 만들어 보자
    RemoteControl rt3 = new RemoteControl() {

      @Override
      public void turnOn() {
        System.out.println("Sony TV를 켭니다");
      }

      @Override
      public void turnOff() {
        System.out.println("Sony TV를 끕니다.");
      }

    };

    rt3.turnOn();

    // 여기서 문제, Student 클래스를 상속받는 무명 클래스를 생성하고
    // 이름을 출력해보시오
    // 무명 클래스를 만들 때(아래 부모클래스이름은 인터페이스 이름을 포함한 의미)
    // new 부모클래스이름(부모클래스의 생성자에게 전달할 인자 리스트){ 클래스 정의 }
    // 무명클래스를 만들 때는 제약이 있는데, 새로운 생성자를 정의할 수 없다.
    // class GradStudent extends Student { public GraduateStudent(...){...}; }

    // 무명 클래스 생성하기
    Student st1 = new Student("대학원생인 홍길동", "컴정") {
      // 무명클래스는 생성자를 정의할 수 없다.
      // 왜? 생성자는 클래스 이름과 같아야 하는데, 무명 클래스는 클래스 이름이 없다.
      // 그렇다고 부모 클래스 이름으로 생성자를 만들 수도 없다. -> 부모 클래스의 기존 생성자를 사용
      // public Student(){}
      @Override
      public String getName() {
        return "안녕하세요? " + super.getName() + " 입니다.";
      }
    };

    System.out.println("학생의 이름 : " + st1.getName());

  }
}
