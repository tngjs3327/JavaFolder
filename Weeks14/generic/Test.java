package Weeks14.generic;

public class Test {

  public static void main(String[] args) {

    /*
     * IntBox ib1 = new IntBox();
     * ib1.setValue(10);
     * // System.out.println(ib1.getValue());
     * 
     * IntBox ib2 = new IntBox();
     * ib2.setValue(20);
     * 
     * int result = ib1.getValue() + ib2.getValue();
     * System.out.println(result);
     */

    /*
     * StrBox sb1 = new StrBox();
     * sb1.setValue("동해물과 ");
     * 
     * StrBox sb2 = new StrBox();
     * sb2.setValue("백두산이");
     * 
     * String result = sb1.getValue() + sb2.getValue();
     * System.out.println(result);
     * 
     * int idx = result.indexOf("백두산이");
     * System.out.println("idx : " + idx + ", String : " + result.substring(idx));
     */

    /*
     * Box b1 = new Box();
     * b1.setValue(20);
     * 
     * Box b2 = new Box();
     * b2.setValue(30);
     * 
     * int result = (int) b1.getValue() + (int) b2.getValue();
     * 
     * System.out.println(result);
     */

    Box strBox = new Box();
    strBox.setValue("마르고 닳도록 하느님이 보우하사 우리나라 만세!");
    Object v = strBox.getValue(); // 이 친구는 Object 이다
    int idx = ((String) v).indexOf("우리나라"); // String으로 형변환 해야된다
    System.out.println(((String) v).substring(idx));

    // Object 타입으로 사용하면 좋지만, 형변환을 해 주어야 한다
    int val = (int) strBox.getValue();
    System.out.println("프로그램을 종료합니다");
    /* 문제점 */
    /*
     * - 값을 빼서 쓸 때 명시적 타입캐스팅(형변환)을 해야 한다. => 귀찮다. 런타임 오류 발생 가능
     * > 제네릭으로 해결가능
     */

  }

}
