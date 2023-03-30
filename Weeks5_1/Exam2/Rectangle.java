package Weeks5_1.Exam2;

public class Rectangle extends Shape {
  private int width;
  private int height;

  public Rectangle(int argX, int argY, int argWidth, int argHeight) {
    super(argX, argY);
    System.out.println("Rectangle()");
    this.width = argWidth;
    this.height = argHeight;
  }

  double calcArea() {
    return width * height;
  }

}
