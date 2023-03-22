package Weeks4_1.Exam1;

public class Employee {
  private String name;
  private double salary;

  private static int count = 0; // static variable

  // 생성자
  public Employee(String argName, double argSalary) {
    this.name = argName;
    this.salary = argSalary;
    count++;
  }

  // 객체가 소멸될 때 호출되는 finalize() 메소드, Object에서 오버라이딩 받는다
  @Override
  protected void finalize() throws Throwable { // 현재는 한순간이고 GB가 자동으로 찾아서 지워주기에 알 수 없다
    count--; // 직원이 줄면 1씩 감소
  }

  // static method, static variable을 반환하는 메소드이기에 static 선언
  public static int getCount() {
    return count;
  }

}
