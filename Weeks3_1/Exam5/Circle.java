package Weeks3_1.Exam5;

public class Circle {
  private Point p;
  private int radius;

  public Circle(Point p, int radius) {
    this.p = p;
    this.radius = radius;
  }

  @Override
  public String toString() {
    return "기준점 : " + p + ", 반지름 : " + radius;
  }

  public static void main(String[] args) {
    Point p = new Point(10, 15);
    Circle c = new Circle(p, 10);

    System.out.println(10);
    System.out.println("안녕");
    System.out.println(p);
    System.out.println(c);
  }

}
