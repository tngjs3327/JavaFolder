package Weeks3_1.Exam1;

public class Television {
  private int channel;
  private int volume;
  private boolean onOff;

  public Television(int c, int v, boolean o) {
    channel = c;
    volume = v;
    onOff = o;
  }

  void print() {
    System.out.println("채널은" + channel + " 이고 볼륨은 " + volume + " 입니다.");
  }

}
