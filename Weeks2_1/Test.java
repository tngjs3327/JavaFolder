package Weeks2_1;

public class Test {

  public static void main(String[] args) {
    JavaTest t1 = new JavaTest();

    // t1.setName("HongGilDong");
    // System.out.println(t1.getName());

    String s1 = "동해물과 백두산이";
    char c = s1.charAt(5);
    // System.out.println(c);
    String s2 = "동해물과 백두산이";

    boolean r = s1 == s2;
    // java의 옵티마이제이션 (String 리터럴일 경우)
    // s1의 값을 리터럴로 저장한 후, 뒤에 s2에 s1 같은 리터럴 값을 저장하면
    // Java에서 자동으로 같은 걸로 취급하여 s1을 가리키게 한다

    String s3 = new String("동해물과 백두산이");
    boolean r2 = s1 == s3;
    // String 객체를 생성할 경우는 다르다

    System.out.println(r);
    System.out.println(r2);

    s1 = "dd";
    System.out.println(s1 == s2);

    System.out.println(s3.equals(s2));

    s1 = new String("i love you");
    s2 = new String("I love you");
    // r = s1.equals(s2);
    r = s1.equalsIgnoreCase(s2); // 대소문자 무시 비교

    System.out.println(r);

    // String 객체는 immutable입니다. mutable 이 아닙니다
    // 이 말은 String 객체의 값은 변경할 수 없다

  }

}
