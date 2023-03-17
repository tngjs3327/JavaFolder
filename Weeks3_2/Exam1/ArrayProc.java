package Weeks3_2.Exam1;

import java.util.Scanner;

public class ArrayProc {
  public void getValue(int[] array) {
    Scanner scn = new Scanner(System.in);
    for (int i = 0; i < array.length; i++) {
      System.out.println("성적을 입력하세요 : ");
      array[i] = scn.nextInt();
    }
  }

  public double getAvg(int[] array) {
    double total = 0;
    for (int i = 0; i < array.length; i++) {
      total += array[i];
    }
    return total / array.length;
  }

}
