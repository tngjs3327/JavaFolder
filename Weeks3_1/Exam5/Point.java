package Weeks3_1.Exam5;

public class Point {
  private int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // 부모로부터 상속받은 메소드를 재정의 하는 것을 오버라이딩이라고 한다.
  // overriding
  @Override
  public String toString() {
    return "x : " + x + ", y : " + y;
  }

}
