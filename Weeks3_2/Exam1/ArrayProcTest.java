package Weeks3_2.Exam1;

public class ArrayProcTest {
  final static int STUDENT = 5;

  public static void main(String[] args) {
    int[] scores = new int[STUDENT];
    ArrayProc obj = new ArrayProc();
    obj.getValue(scores);
    System.out.println("평균은 = " + obj.getAvg(scores));
  }
}
