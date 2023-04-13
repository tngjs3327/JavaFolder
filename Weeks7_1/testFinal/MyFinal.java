package Weeks7_1.testFinal;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class MyFinal extends JFrame {

  public MyFinal() {
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("MyFrame...");
    setLayout(new FlowLayout()); // 컴포넌트 배치

    JButton button = new JButton("버튼");
    add(button);
    setVisible(true);

  }

  public static void main(String[] args) {
    MyFinal f = new MyFinal();
  }

}
