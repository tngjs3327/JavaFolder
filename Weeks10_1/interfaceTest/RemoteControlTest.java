package Weeks10_1.interfaceTest;

public class RemoteControlTest {
  public static void main(String[] args) {
    // RemoteControl rm = new SamsungTv();
    // rm.turnOn();
    // rm.volumeControl(3);

    // rm = new LgTv();
    // rm.turnOn();
    // rm.volumeControl(-2);

    RemoteControl rm = new SamsungTv();
    turnOnAndControlVolume(rm, 3);

    rm = new LgTv();
    turnOnAndControlVolume(rm, -2);

  }

  public static void turnOnAndControlVolume(RemoteControl rm, int vol) {
    rm.turnOn();
    if (rm instanceof AdvancedRemoteControl) {
      ((AdvancedRemoteControl) rm).volumeControl(3); // 형변환부터 해야되기 때문에 괄호로 묶음
    } else {
      System.out.println("이 기기는 원격 볼륨제어를 지원하지 않습니다.");
    }
  }

}
