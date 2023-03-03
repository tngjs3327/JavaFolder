package Weeks1_2;

public class JavaTest {
  private String name;

  void setName(String argName) {
    this.name = argName;
  }

  String getName() {
    return name; // this.name
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
    t.name = "HongGilDong";
    System.out.println(t.name);

    JavaTest t2 = new JavaTest();
    t2.name = "Kim";
    System.out.println(t2.name);

    // if (args.length == 0) {
    // System.out.println("Usarg : java TestJava name");
    // } else {
    // System.out.println("Hello " + args[0]);
    // }

    // JavaTest jt = new JavaTest();
    // int result = jt.square(3);
    // System.out.println(result);

    // double result2 = jt.square(3.14);
    // System.out.println(result2);
    // System.out.println("String...");

  }
}