package Weeks3_2;

public class Car {
  private int speed;
  private String name;

  public Car() {
    System.out.println("난 생성자");
    System.out.println("속도는 " + speed);
  }

  // 인스턴스 초기화 블록(instance initialization block)
  // 초기화 블록은 생성자에 카피된다
  // 생성자들에서 공통으로 사용되는 초기화 알고리즘은 초기화 블럭을 사용해서 나타낸다
  // 생성자보다 먼저 실행된다
  {
    System.out.println("난 인스턴스 초기화 블록");
    this.speed = 100;
  }

  public Car(String argName) {
    this.name = argName;
    System.out.println("속도는 : " + this.speed);
  }

  public static void main(String[] args) {
    Car c = new Car();
    System.out.println("-----------------------");
    Car c2 = new Car("그랜져");

  }

}
