package Weeks5_1.inheritance;

public class Derived extends Base {
  public Derived(String argMsg) {
    // 부모 클래스의 생성자를 명시적으로 호출하지 않으면
    // 묵시적으로 호출됨. 이 때 묵시적으로 호출되는 부모 클래스 생성자는
    // 어떠한 인자도 가지지 않는다
    // super("옛다."); // 부모 클래스의 생성자를 호출하는 코드는 반드시 첫줄에 와야 한다
    super(argMsg);
    System.out.println("Derived() 생성자 호출됨");
  }
}
