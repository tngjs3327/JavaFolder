package Weeks6_1.polymorphism;

public class Professor extends Comparable {
  private String name;

  public Professor(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public int compareTo(Comparable anotherVal) {
    Professor prof = (Professor) anotherVal;
    String profName = prof.getName();
    return name.compareTo(profName);
  }

  @Override
  public String toString() {
    return "[교수님 성함 : " + name + " 교수님]";
  }

}
