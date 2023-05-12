package Weeks11_2.anonymous;

import Weeks10_1.interfaceTest.*;

public class CallbackTest2 {
  public void remoteControl(RemoteControl rc) {
    rc.turnOn();
  }

  public static void main(String[] args) {
    CallbackTest2 cb = new CallbackTest2();
    // 무명 클래스로 RemoteControl 객체를 인자로 전달하시오
    // 1. 변수 사용해서 전달해보고
    // 2. 변수 사용하지 않고 전달해보고
    // 화면에는 파나소닉 테레비가 켜졌습니다.

    RemoteControl rc = new RemoteControl() {

      @Override
      public void turnOn() {
        System.out.println("파나소닉 테레비가 켜졌습니다.");
      }

      @Override
      public void turnOff() {
        System.out.println("파나소닉 테레비가 꺼졌습니다.");
      };

    };

    cb.remoteControl(rc);
    cb.remoteControl(new RemoteControl() {

      @Override
      public void turnOn() {
        System.out.println("파나소닉 테레비가 켜졌습니다.");
      }

      @Override
      public void turnOff() {
        System.out.println("파나소닉 테레비가 꺼졌습니다.");
      };

    });
  }

}
