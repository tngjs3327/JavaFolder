package Weeks10_1.interfaceTest;

public class DirectionTest implements Direction {
  public static void main(String[] args) {
    System.out.println("NORTH : " + Direction.NORTH);
    System.out.println("SOUTH : " + Direction.SOUTH);
    // Direction.EAST = 100; // 상수이기 때문에 값을 변경할 수 없다

    // Direction 인터페이스를 구현하면, 나의 상수인것처럼 그냥 아래와 같이
    // 사용할 수 있다.
    System.out.println("EAST : " + EAST);

  }
}
