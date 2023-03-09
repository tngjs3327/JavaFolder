package Weeks2_1.Exam1;

import java.util.Scanner;

public class Exam1 {
  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    String inputString;

    while (true) {
      System.out.print("문자열을 입력하세요 : ");
      inputString = scn.next();

      if (inputString.equals("quit")) {
        System.out.println("프로그램 종료");
        break;
      } else if (inputString.matches("^www\\.(.+)")) { // 정규식을 사용하여 비교
        System.out.println(inputString + "은 'www'로 시작합니다.");
      } else {
        System.out.println(inputString + "은 'www'로 시작하지 않습니다.");
      }

    }
    scn.close();

  }

}
