package Weeks6_1.polymorphism;

import java.util.*;

public class Test2 {
  public static void main(String[] args) {
    int values[] = new int[10];
    Random random = new Random(System.currentTimeMillis()); // seed값을 주면 더 다양한 랜덤이 나온다? long type
    // System.currentTimeMillis() 는 1970년 1월 1일부터 경과한 시간을 long 값으로 리턴하며,
    // 밀리세컨드(1/1000초)값을 리턴

    System.out.println("그냥 보는 값 : " + System.currentTimeMillis());

    System.out.println();

    for (int i = 0; i < values.length; i++) {
      values[i] = random.nextInt(100);
    }

    System.out.println("정렬하기 전");
    for (int val : values) {
      System.out.print(val + " ");
    }

    System.out.println("\n정렬 후");
    // Util.selectionSort(values); // call - by - Ref
    Util.selectionSort(values, true); // call - by - Ref, refFlag가 true이면 내림차순, false는 오름차순
    for (int val : values) {
      System.out.print(val + " ");
    }
    System.out.println();
  }
}
