package Weeks10_1.interfaceTest;

public class SamsungTv implements AdvancedRemoteControl {

  @Override
  public void turnOn() {
    System.out.println("삼성 TV를 켭니다");
  }

  @Override
  public void turnOff() {
    System.out.println("삼성 TV를 끕니다");
  }

  @Override
  public void volumeControl(int amount) {
    String st = null;
    st = amount >= 0 ? "높입니다." : "줄입니다.";
    amount = Math.abs(amount); // |number| : 절대값
    System.out.println("삼성 TV의 볼륨을 " + amount + " 만큼 " + st);
  }

}
