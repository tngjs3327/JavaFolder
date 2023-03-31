package Weeks5_2.polymorphism;

public class Test {
  public static void main(String[] args) {

    Shape shapes[] = new Shape[5];

    Shape s = new Shape();
    // s.draw();
    shapes[0] = s;

    s = new Rectangle();
    // s.draw();
    shapes[1] = s;

    s = new Triangle();
    // s.draw();
    shapes[2] = s;

    s = new Circle();
    // s.draw();
    shapes[3] = s;

    s = new Polygon();
    // s.draw();
    shapes[4] = s;

    Test.drawShape(shapes);

  }

  public static void drawShape(Shape[] argShapes) {
    for (Shape s : argShapes) { // forEach
      s.draw();
    }

    // forEach문 변경 전
    // for (int i = 0; i < argShapes.length; i++) {
    // Shape s = argShapes[i];
    // s.draw();
    // }

  }

}
