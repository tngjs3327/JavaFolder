package Weeks5_2;

abstract class A {
  int a;

  public void prt() {
    System.out.println("p");
  }
}

class B extends A {
  private int a = 2;

  public void prt() {
    System.out.println("C");
  }
}

public class Eex {
  public static void main(String[] args) {
    A b = new B();
    System.out.println(b.a);
    b.prt();

  }
}
