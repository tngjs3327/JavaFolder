package Weeks13.lambda;

// https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Person {
  private String name;
  LocalDate birthDay;
  private String emailAddress;
  private Sex gender;

  public enum Sex { // enum 타입 : 여러개의 상수를 정의
    MALE, FEMALE;
  }

  public Person(String name, LocalDate birthDay, String emailAddress, Sex gender) {
    this.name = name;
    this.birthDay = birthDay;
    this.emailAddress = emailAddress;
    this.gender = gender;
  }

  // getter 부분
  public String getName() {
    return name;
  }

  public LocalDate getBirthDay() {
    return birthDay;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public Sex getGender() {
    return gender;
  }

  public int getAge() {

    // Period p = Period.between(birthDay, LocalDate.now());
    // return p.getYears();
    return Period.between(birthDay, LocalDate.now()).getYears();

    // method chaining : 메소드 호출을 쇠사슬이 연결된 것 처럼, 이어서 쭉 호출하는 것
    // ex : this.getName().substring(1, 2);

  }

  // 상태 출력
  public void printPerson() {
    // System.out.println("Name:" + name + " BirthDay: " + birthDay + " Email: " +
    // emailAddress + " Gender: " + gender);
    System.out.printf("Name : %s, birthDay : %s, Gender : %s, Email : %s, Age : %d\n", name, birthDay, gender.toString(),
        emailAddress, getAge());
  }


}
