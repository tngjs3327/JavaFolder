package Weeks5_2.polymorphism;

public class Shape {
  private int x, y;

  public int getX() {
    return x;
  }

  public void setX(int argX) {
    this.x = argX;
  }

  public int getY() {
    return y;
  }

  public void setY(int argY) {
    this.y = argY;
  }

  public void draw() {
    System.out.println("Shape Draw[ " + x + ", " + y + " ]");
  }

}
