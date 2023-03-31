package Weeks5_2.polymorphism;

public class Circle extends Shape {
  private int radius;

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override
  public void draw() {
    System.out.println("Circle Draw[ " + radius + " ]");
  }

}
