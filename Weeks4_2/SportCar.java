package Weeks4_2;

public class SportCar extends Car {
  private boolean turbo;

  public boolean isTurbo() {
    return this.turbo;
  }

  public void setTurbo(boolean argTurbo) {
    this.turbo = argTurbo;
  }

  @Override
  public String toString() {
    return "Speed : " + getSpeed() + ", Turbo : " + isTurbo();
  }
}
