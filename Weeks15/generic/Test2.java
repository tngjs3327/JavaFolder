package Weeks15.generic;

import java.util.*;

public class Test2 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Grape");
    list.add("Potato");
    list.add("Strawberry");
    list.add("Banana");
    list.add("Apple");

    print(list);

    Collections.sort(list);
    System.out.println("정렬 후");
    print(list);

  }

  public static void print(List<String> list) {
    for (String s : list) {
      System.out.println(s);
    }
    System.out.println();
  }
}
