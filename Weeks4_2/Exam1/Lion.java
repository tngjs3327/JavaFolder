package Weeks4_2.Exam1;

public class Lion extends Animal {
  private int legs = 4;

  public int getLegs() {
    return legs;
  }

  public void setLegs(int argLegs) {
    this.legs = argLegs;
  }

  public void roar() {
    System.out.println("roar()가 호출됨");
  }

}
