package Weeks4_1;

public class Car {
  private String model;
  private String color;
  private int speed;

  // 상수란? : 한번 초기화되면 절대 값을 변경할 수 없는 값
  // 자바에서는 상수를 어떻게 만드나? final keyword 사용
  // 자바에서 상수는 static으로 만드는 것이 바람직
  // 상수는 대문자로 사용하는 것이 관례
  // 상수는 일반적으로 public으로 선언한다
  // public static final int MAX_SPEED = 350;
  public static final int MAX_SPEED;

  // static 초기화 블럭
  static {
    MAX_SPEED = 350;
    System.out.println("MAX_SPEED가 초기화되었습니다. ");
  }

  // 초기화 블럭
  {
    this.model = "그랜저";
    this.color = "흰색";
  }

  // 자동차의 시리얼 넘버
  private int id;
  // int number = 0;
  // 정적 멤버 변수로 만들어서, 모든 인스턴스가 이 변수를 공유하도록 하자
  private static int numbers = 0;

  // 생성자
  /* id = ++number; */
  public Car(String argModel, String argColor, int argSpeed) {
    this.model = argModel;
    this.color = argColor;
    this.speed = argSpeed;

    this.id = ++numbers;
    // MAX_SPEED = 500; // 불가능, 상수의 값은 변경할 수 없다
  }

  // static method가 맞나? instance method로 구현하는 것이 맞나? : static
  // static method는 instance method를 호출할 수 있다 없다? : 없다
  public static int getNumbers() {
    // print(); // instance method
    return numbers;
  }

  // instance method : instance가 생성되어야만 존재하는 메소드
  public void print() {
    System.out.println("Hi ~~~~~~~ !");
  }

  @Override
  public String toString() {
    return "모델 : " + this.model + ", 색 : " + this.color
        + ", 속도 : " + this.speed + ", id : " + this.id;
  }

  public static void main(String[] args) {
    Car c1, c2, c3;
    c1 = new Car("s600", "white", 80);
    c2 = new Car("E500", "blue", 20);
    c3 = new Car("E300", "gray", 100);

    System.out.println(c1.toString());
    System.out.println(c2.toString());
    System.out.println(c3.toString());
    System.out.println("생성된 자동차 수 : " + Car.getNumbers());

    // 자바의 수학관련 라이브러리 클래스는 정적 메서드를 이용
    double d = Math.sqrt(9); // 제곱근
    System.out.println("9의 제곱근 : " + d);

    System.out.println(Car.MAX_SPEED);
  }

}
