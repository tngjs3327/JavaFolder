package Weeks4_2.Exam2;

public class Rectangle extends Shape {
  private int width;
  private int height;

  public int getWidth() {
    return this.width;
  }

  public void setWidth(int argWidth) {
    this.width = argWidth;
  }

  public int getHeight() {
    return this.height;
  }

  public void setHeight(int argHeight) {
    this.height = argHeight;
  }

  double area() {
    return (double) width * height;
  }

  void draw() {
    System.out.println("(" + this.getX() + ", " + this.getY() + ") 위치에 가로 : " + this.width + ", 세로 : " + this.height);
  }

}
