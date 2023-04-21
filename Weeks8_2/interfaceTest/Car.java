package Weeks8_2.interfaceTest;

public class Car implements Comparable {
  private String brand;
  private String model;
  private int speed;
  private int price;

  public Car() {
    this("UnKnown", "UnKnown", 0, 0);
  }

  public Car(String brand, String model, int speed, int price) {
    this.brand = brand;
    this.model = model;
    this.speed = speed;
    this.price = price;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public int compareTo(Comparable obj) {
    // 차의 가격 비교를 하려면, Car 클래스의
    // getPrice 메소드를 호출해야 되니, 부득이
    // Comparable 타입으로 받은 인자를
    // Car 타입으로 하향 형변환.
    // 물론 이 obj 객체는 Car 클래스의 타입이 객체이어야만 하고,
    // 그렇다고 가정하자
    Car yourCar = (Car) obj;
    // 내차 가격과 인자로 전달된 차의 가격을 비교
    /*
     * int result = 0;
     * if (price > yourCar.getPrice())
     * result = 1;
     * else if (price < yourCar.getPrice())
     * result = -1;
     * return result;
     */

    /*
     * if (price == yourCar.getPrice())
     * return 0;
     * else if (price > yourCar.getPrice())
     * return 1;
     * else
     * return -1;
     */

    int yourPrice = yourCar.getPrice();

    if (price == yourPrice)
      return 0;
    else if (price > yourPrice)
      return 1;
    else
      return -1;

  }

  @Override
  public String toString() {
    return "[ 브랜드 : " + brand + ", 모델 : " + model + ", speed : " + speed + ", price : " + price + " ]";
  }

}
