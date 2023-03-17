package Weeks3_1;

public class Student {
  private String name;
  private int birthYear;
  private String dept;
  private String address;

  public Student() {
    this.name = "없음";
    this.birthYear = 0;
    this.dept = "없음";
    this.address = "없음";
  }

  public Student(String argName, int argBirthYear, String argDept, String argAddress) {
    this.name = argName;
    this.birthYear = argBirthYear;
    this.dept = argDept;
    this.address = argAddress;
  }

  @Override
  public String toString() {
    return "Student [ name : " + this.name + ", birthYear : " + this.birthYear +
        ", dept : " + this.dept + ", address : " + this.address + "]";
  }

}