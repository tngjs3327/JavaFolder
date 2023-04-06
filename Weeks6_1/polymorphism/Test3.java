package Weeks6_1.polymorphism;

public class Test3 {
  public static void main(String[] args) {
    Student[] stds = new Student[5];

    stds[0] = new Student("석진석", "2201363");
    stds[1] = new Student("이재일", "2201392");
    stds[2] = new Student("김일곤", "2201330");
    stds[3] = new Student("최진수", "1801295");
    stds[4] = new Student("조현준", "1901276");

    System.out.println("stds 오름차순 정렬");
    // refFlag가 true이면 내림차순, false는 오름차순
    Util.selectionSort(stds, false);
    for (Student std : stds) {
      System.out.println(std);
    }

    System.out.println("\nstds 내림차순 정렬");
    Util.selectionSort(stds, true);
    for (Student std : stds) {
      System.out.println(std);
    }

    System.out.println("---------------------------");
    Professor[] profs = new Professor[5];

    profs[0] = new Professor("박성철");
    profs[1] = new Professor("김종율");
    profs[2] = new Professor("이중권");
    profs[3] = new Professor("조수연");
    profs[4] = new Professor("류은영");

    System.out.println("profs 오름차순 정렬");
    Util.selectionSort(profs, false);
    for (Professor prof : profs) {
      System.out.println(prof.toString());
    }

    System.out.println("\nprofs 내림차순 정렬");
    Util.selectionSort(profs, true);
    for (Professor prof : profs) {
      System.out.println(prof.toString());
    }

  }

}
