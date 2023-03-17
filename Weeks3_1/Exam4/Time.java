package Weeks3_1.Exam4;

public class Time {
  private int hour;
  private int minute;
  private int second;

  public Time() {
    this(0, 0, 0);
  }

  public Time(int h, int m, int s) {
    this.hour = ((h >= 0 && h < 24) ? h : 0);
    this.minute = ((m >= 0 && m < 60) ? m : 0);
    this.second = ((s >= 0 && s < 60) ? s : 0);
  }

  @Override
  public String toString() {
    return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
  }

}
