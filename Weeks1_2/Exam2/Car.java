package Weeks1_2.Exam2;

public class Car {
  private String color;
  private int gear;
  private int speed;

  void changeGear(int argGear) {
    this.gear = argGear;
  }

  void speedUp() {
    this.speed += 10;
  }

  void speedDown() {
    this.speed -= 10;
  }

  @Override
  public String toString() {
    return "Car [ color : " + this.color + ", gear : " +
        this.gear + ", speed : " + this.speed + " ]";
  }

}
