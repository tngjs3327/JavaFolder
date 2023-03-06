package Weeks1_2.Exam1;

public class Exam1 {
  public static void main(String[] args) {

    Box box1 = new Box();

    box1.setWidth(20);
    box1.setLength(20);
    box1.setHeight(30);

    System.out.println("width : " + box1.getWidth());
    System.out.println("length : " + box1.getLength());
    System.out.println("height : " + box1.getHeight());

  }
}
