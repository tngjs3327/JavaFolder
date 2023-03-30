package Weeks5_1.Exam2;

public class ColoredRectangle extends Rectangle {
  String color;

  public ColoredRectangle(int argX, int argY, int argWidth, int argHeight, String argColor) {
    super(argX, argY, argWidth, argHeight);
    System.out.println("ColoredRectangle()");
    this.color = argColor;
  }

  public static void main(String[] args) {
    ColoredRectangle obj = new ColoredRectangle(10, 10, 20, 20, "red");
    System.out.println(obj.calcArea());
  }

}
