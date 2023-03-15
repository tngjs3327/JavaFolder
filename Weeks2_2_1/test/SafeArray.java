package Weeks2_2_1.test;

public class SafeArray {
  private int a[];

  public void createArray(int argSize) {
    this.a = new int[argSize];
  }

  public int get(int argIndex) {
    if (argIndex >= 0 && argIndex < this.a.length)
      return this.a[argIndex];
    System.out.println("잘못된 인덱스 : " + argIndex);
    return -1; // -1은 배열에 들어갈 수 없는 숫자로 가정
  }

  public void put(int argIndex, int argValue) {
    if (argIndex >= 0 && argIndex < this.a.length) {
      this.a[argIndex] = argValue;
      return;
    }
    System.out.println("잘못된 인덱스 : " + argIndex);
  }

  public static void main(String[] args) {
    SafeArray array = new SafeArray();
    array.createArray(10);

    array.put(2, 100);
    array.put(10, 200);

    System.out.println(array.get(2));
  }

}
