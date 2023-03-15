package Weeks2_2_1.test;

import java.time.LocalDate;

public class Student {
  private String name;
  private int birthYear;

  public void setName(String argName) {
    this.name = argName;
  }

  public void setBirthYear(int argBirthYear) {
    if (argBirthYear >= 1900) {
      this.birthYear = argBirthYear;
      return;
    }
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    LocalDate d = LocalDate.now();
    int year = d.getYear(); // 현재 년도
    return (year - this.birthYear);
  }

}
