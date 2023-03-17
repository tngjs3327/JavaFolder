package Weeks3_2;

public class MyCounter {
  private int value;

  public void setValue(int argValue) {
    this.value = argValue;
  }

  public int getValue() {
    return this.value;
  }

  public static void addOne(int val) {
    val += 1;
  }

  // 주어진 값만을 사용한다면 static으로 선언해서 사용하는 것이 좋다
  public static void increase(MyCounter cntObj) {
    int v = cntObj.getValue() + 1;
    cntObj.setValue(v);
  }

  public static void main(String[] args) {
    // int val = 10;
    // MyCounter.addOne(val);
    // System.out.println(val);

    MyCounter mc = new MyCounter();
    mc.setValue(10);
    MyCounter.increase(mc);
    System.out.println(mc.getValue());

  }

}
