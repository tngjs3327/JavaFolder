package Weeks5_2.Exam1;

class Animal {
  void sound() {
    System.out.println("Animal 클래스의 sound()");
  }
}

class Dog extends Animal {
  void sound() {
    System.out.println("멍멍");
  }
}

class Cat extends Animal {
  void sound() {
    System.out.println("야옹");
  }
}

public class DynamicCallTest {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Dog dog = new Dog();
    Cat cat = new Cat();

    Animal obj;

    obj = animal;
    obj.sound();

    obj = dog;
    obj.sound();

    obj = cat;
    obj.sound();


  }
}
