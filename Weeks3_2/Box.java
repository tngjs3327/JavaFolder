package Weeks3_2;

public class Box {
  private int width, length, height;
  // private int volume;

  public Box(int w, int len, int h) {
    this.width = w;
    this.length = len;
    this.height = h;

    // this.volume = this.width * this.length * this.height;
    // 객체를 생성할 때 계산되는 것 보다 메서드로 만들어서 최신화 시켜주는게 좋다
  }

  // getVolume 메서드는 내부적으로만 사용하기 때문에 private로 만듦
  public int getVolume() {
    return width * length * height;
  }

  public static Box whoIsLargerBox(Box box1, Box box2) {
    if (box1.getVolume() > box2.getVolume()) {
      return box1;
    }
    return box2;
  }

  public static Boolean isSameBox(Box box1, Box box2) {
    if ((box1.width == box2.width) && (box1.length == box2.length) && (box1.height == box2.height)) {
      return true;
    }
    return false;
  }

  public static void main(String[] main) {
    Box b1 = new Box(10, 20, 50);
    Box b2 = new Box(10, 30, 30);

    System.out.println("첫 번째 박스의 부피 : " + b1.getVolume());
    System.out.println("두 번째 박스의 부피 : " + b2.getVolume());

    Box largerBox = Box.whoIsLargerBox(b1, b2);

    System.out.println("같은 박스 ? " + Box.isSameBox(b1, b2));
    System.out.println("더 큰 박스의 부피 : " + largerBox.getVolume());

  }

}
