package Weeks1_2;

public class Test {
  public static void main(String[] args) {
    JavaTest t1 = new JavaTest();
    // t1.name = "HongGilDong"; // private 로 선언되어있기 때문에 에러
    // System.out.println(t1.name); // 에러

    t1.setName("HongGilDong");
    System.out.println(t1.getName());

  }
}
