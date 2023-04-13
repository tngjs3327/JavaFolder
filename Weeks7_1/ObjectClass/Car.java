package Weeks7_1.ObjectClass;

public class Car {
  String brand;
  String model;

  public Car(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  public Car() {
    this("Unknown", "UnKnown");
  }

  @Override
  public boolean equals(Object obj) {
    // obj가 Car 클래스의 인스턴스가 아니면 바로 false를 반환하자
    // 자바에는 이 목적으로 사용할 수 있는 연산자(+, -, *, /, % ...와 같은)
    // instanceof 가 있다
    // 연산자 사용 예 : 3+4 O, +(3, 4) X

    if (obj == null || !(obj instanceof Car))
      return false;

    // obj는 Car 클래스의 객체라 가정한다
    // 그래야, Car 클래스의 인스턴스의 brand, model 멤버에 접근할 수 있다

    // 교수님 코드
    // Car yourCar = (Car) obj; // 하향 형변환
    // if (yourCar.equals((brand)) && yourCar.equals(model)) {
    // return true;
    // }
    // return false;

    Car argCar = (Car) obj; // 하향 형변환
    if (this.brand.equals((argCar.brand)) && this.model.equals(argCar.model)) {
      return true;
    }
    return false;

  }

}
