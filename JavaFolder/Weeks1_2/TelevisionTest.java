package Weeks1_2;

public class TelevisionTest {
  public static void main(String[] args) {
    Television myTv = new Television();

    myTv.channel = 7;
    myTv.volume = 9;
    myTv.isOn = true;
    myTv.print();

    Television yourTv = new Television();
    yourTv.channel = 9;
    yourTv.volume = 12;
    yourTv.isOn = true;
    yourTv.print();

  }
}
