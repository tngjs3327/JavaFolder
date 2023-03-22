package Weeks4_1.Exam2;

import java.util.ArrayList;

public class GameCharacter {
  private class GameItem { // 내부 클래스
    String name;
    int type;
    int price;

    int getPrice() {
      return this.price;
    }

    @Override
    public String toString() {
      return "GameItem [ name : " + this.name + ", type : " + this.type
          + ", price : " + this.price + "]";
    }

  } // GameItem class

  private ArrayList<GameItem> gameItemList = new ArrayList<GameItem>();

  public void add(String argName, int argType, int argPrice) {
    GameItem item = new GameItem();
    item.name = argName;

  }

}
