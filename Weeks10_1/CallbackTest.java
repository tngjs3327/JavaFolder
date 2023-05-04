package Weeks10_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.Timer;

class MyClass implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("beep");
  }
}

public class CallbackTest {
  public static void main(String[] args) {

    ActionListener listener = new MyClass();

    Timer t = new Timer(1000, listener);
    t.start();

    Scanner input = new Scanner(System.in);
    System.out.println("Press Enter to quit!");
    input.nextLine();
    input.close();
    System.out.println("프로그램을 종료합니다.");

  }
}
