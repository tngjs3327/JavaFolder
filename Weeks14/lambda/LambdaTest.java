package Weeks14.lambda;

import java.util.*;
import java.util.function.Predicate;

public class LambdaTest {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("AAA");
    list.add("bbb");
    list.add("CCC");
    list.add("ddd");
    list.add("EEE");

    System.out.println("정렬전");
    printList(list);
    
    Collections.sort(list, (s1, s2) -> s1.compareToIgnoreCase(s2));
    // Collections.sort(list);
    System.out.println("정렬후");
    printList(list);

  }

  public static void printList(List<String> list) {
    for (String s : list) {
      System.out.println(s);
    }
    System.out.println();
  }

}
