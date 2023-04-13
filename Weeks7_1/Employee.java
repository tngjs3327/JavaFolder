package Weeks7_1;

public class Employee {
  private String name;
  private Date birthDate;

  public Employee(String name, Date birthDate) {
    this.name = name;
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    return "Employee [ name : " + name + ", birthDate : " + birthDate + " ]";
  }
}
