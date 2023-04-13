package Weeks7_1.ObjectClass;

import Weeks4_1.Box;

public class CarTest {
  public static void main(String[] args) {
    // Car car = new Car();

    // Class classvar = car.getClass();
    // System.out.println(classvar.getName()); // ObjectClass 패키지의 Car 클래스,
    // Weeks7_1.ObjectClass.Car

    // System.out.println("브랜드 : " + car.brand + ", 모델 : " + car.model);

    Car car1 = new Car("현대", "그랜져");
    Car car2 = new Car("현대", "그랜져");

    System.out.println(car1.equals(car2));
    System.out.println(car1 == car2);

    Car car3 = null;

    System.out.println(car1.equals(car3));

    // Weeks4_1.Box box = new Box(10, 20, 30);
    Box box = new Box(10, 20, 30);

    System.out.println(car1.equals(box)); //

    System.out.println("프로그램을 종료합니다");

  }
}
