package Weeks15.generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test5 {
  public static void main(String[] args) {
    Professor p1 = new Professor("홍길동", 40);
    Professor p2 = new Professor("박길동", 34);
    Professor p3 = new Professor("고길동", 46);
    Professor p4 = new Professor("이길동", 53);
    Professor p5 = new Professor("최길동", 28);

    List<Professor> list = new ArrayList<>();

    list.add(p1);
    list.add(p2);
    list.add(p3);
    list.add(p4);
    list.add(p5);

    print(list);

    // Professor 클래스를 변경하지 않고, List에 들어있는 Professor 객체들을
    // 나이의 오름차순으로 정렬하여 출력하시오
    // 유명클래스, 무형클래스, 람다의 3가지 방법으로 각각 구현해 보시오
    // Collections.sort(list); //이 코드는 컴파일 오류가 발생한다. 그 이유는?

    System.out.println("정렬 후");

    // Collections.sort(list, new MyCom());

    // Collections.sort(list, new Comparator<Professor>(){
    //     @Override
    //     public int compare(Professor p1, Professor p2) {
    //       return p1.age - p2.age;
    //     }
    // });

    Collections.sort(list, (z1, z2) -> z1.age - z2.age);

    

    print(list);

  }
  
  public static void print(List<Professor> list) {
    for (Professor p : list) {
      System.out.println("[ " + p.name + ", " + p.age + " ]");
    }
    System.out.println();
  }
  
}

class MyCom implements Comparator<Professor> {
  @Override
  public int compare(Professor p1, Professor p2) {
    return p1.age - p2.age;
  }
}

