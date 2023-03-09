package Weeks2_1;

public class JavaTest {
  private String name; // 멤버 변수, instance variable

  void setName(String argName) { // argName : 매개변수
    this.name = argName;
  }

  String getName() {
    return name; // this.name
  }

  // static method
  static void sayHello() {
    System.out.println("Hi~~~~~~~~");
  }

  // member method
  // instance method
  double square(double df) {
    test();
    return df * df;
  }

  int square(int num) {
    return num * num;
  }

  void test() {
    System.out.println("test method called");
  }

  public static void main(String[] args) {

    JavaTest t = new JavaTest();
    t.name = "HongGilDong"; // JavaTest에 있기 때문에 접근 가능
    t.setName("홍길동"); // 홍길동 : 인자
    // JavaTest.setName();
    System.out.println(t.name);

    JavaTest t2 = new JavaTest();
    t2.name = "Kim";
    System.out.println(t2.name);

    JavaTest.sayHello();

  }
}