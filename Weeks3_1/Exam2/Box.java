package Weeks3_1.Exam2;

public class Box {
  private int width;
  private int length;
  private int height;
  private int volume;

  public int getVolume() {
    return volume;
  }

  public Box(int w, int l, int h) {
    this.width = w;
    this.length = l;
    this.height = h;
    this.volume = this.width * this.length * this.height;
  }
}
