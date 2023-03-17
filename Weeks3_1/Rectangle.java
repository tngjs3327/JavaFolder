package Weeks3_1;

public class Rectangle {
  private int x, y;
  private int width, height;

  public Rectangle(int x, int y, int width, int height) {
    System.out.println("내가 1번");
    this.x = x;
    this.y = y;
    this.width = width;
  }

  public Rectangle(int width, int height) {
    this(0, 0, width, height);
    System.out.println("나도 생성자");
  }

  public Rectangle() {
    this(0, 0, 1, 1); // 첫 문장으로 실행되어야 한다
    System.out.println("난 생성자");
  }
}
