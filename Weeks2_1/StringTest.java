package Weeks2_1;

public class StringTest {
  public static void main(String[] args) {

    // String 객체는 immutable입니다. mutable 이 아닙니다
    // 이 말은 String 객체의 값은 변경할 수 없다

    String proverb = "A barking dog";
    String s1, s2, s3, s4;

    System.out.println(proverb.length());

    // proverb.concat(" never Bites!");
    // // concat은 문자열 뒤에 붙이고 그 주소값을 반환, 기존 String에는
    // // 영향이 없다
    // System.out.println(proverb);

    s1 = proverb.concat(" never Bites!");
    System.out.println(s1);

    s2 = proverb.replace("b", "B");
    // 문자열의 모든 "b"를 "B"로 바꾸고 그 주소값을 반환해라
    System.out.println(s2);

    s3 = proverb.substring(2, 3);
    // 인덱스 2번쨰 부터 인덱스 3 미만 까지 잘라낸 후 주소값 반환
    System.out.println(s3);

    s4 = proverb.toUpperCase();
    // 문자열 전체를 대문자로 변환 후 주소값 전달
    System.out.println(s4);

    int x = 20;
    System.out.println("결과값은 " + x);

    System.out.println("100" + x);
    System.out.println(100 + x);

    String s = "1234";
    int n = Integer.parseInt(s);
    double d = Double.parseDouble(s);
    float f = Float.parseFloat(s);
    long l = Long.parseLong(s);

  }
}
