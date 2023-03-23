package Weeks4_2.Exam2;

public class Shape {
  private int x;
  private int y;

  public int getX() {
    return this.x;
  }

  public void setX(int argX) {
    this.x = argX;
  }

  public int getY() {
    return this.y;
  }

  public void setY(int argY) {
    this.y = argY;
  }

  void print() {
    System.out.println("x좌표 : " + this.x + ", y좌표 : " + this.y);
  }

}
