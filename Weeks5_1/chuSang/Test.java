package Weeks5_1.chuSang;

public class Test {
  public static void main(String[] args) {
    // Shape s = new Shape();
    Rectangle r = new Rectangle();
    Circle c = new Circle();
    Triangle t = new Triangle();

    r.draw();
    r.move(10, 20);
    c.draw();
    c.move(20, 30);
    t.draw();

  }
}
