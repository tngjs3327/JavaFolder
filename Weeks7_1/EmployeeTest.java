package Weeks7_1;

public class EmployeeTest {
  public static void main(String[] args) {
    Date birth = new Date(1990, 1, 1);
    Employee employee = new Employee("홍길동", birth);
    System.out.println(employee);
  }
}
