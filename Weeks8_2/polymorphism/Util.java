package Weeks8_2.polymorphism;

public class Util {
  // public static void selectionSort(int[] values) {
  public static void selectionSort(int[] values, boolean revFlag) {

    // 삽입정렬 만들기
    for (int i = 0; i < values.length; i++) {
      int minIdx = i; // 가장 작은 인덱스 번호
      for (int j = i + 1; j < values.length; j++) {
        // 현재까지 찾은 최소값(values[minIdx])과
        // values[j]를 비교해서 values[j]가 더 작으면
        // minIdx를 j로 설정 : minIdx = j;
        // if (values[minIdx] > values[j]) {
        if (revFlag ? values[minIdx] < values[j] : values[minIdx] > values[j]) {
          minIdx = j;
        }
      }

      // minIdx의 값과 i의 값을 교환
      swap(i, minIdx, values);

    }

  }

  // public static void selectionSort(Comparable[] values) {
  public static void selectionSort(Weeks8_2.interfaceTest.Comparable[] values, boolean revFlag) {

    // 삽입정렬 만들기
    for (int i = 0; i < values.length; i++) {
      int minIdx = i; // 가장 작은 인덱스 번호
      for (int j = i + 1; j < values.length; j++) {
        // 현재까지 찾은 최소값(values[minIdx])과
        // values[j]를 비교해서 values[j]가 더 작으면
        // minIdx를 j로 설정 : minIdx = j;
        // if (values[minIdx].compareTo(values[j]) > 0) {
        if (revFlag ? values[minIdx].compareTo(values[j]) < 0 : values[minIdx].compareTo(values[j]) > 0) {
          minIdx = j;
        }
      }

      // minIdx의 값과 i의 값을 교환
      swap(i, minIdx, values);

    }

  }

  private static void swap(int idx1, int idx2, int[] values) {
    int temp = values[idx1];
    values[idx1] = values[idx2];
    values[idx2] = temp;
  }

  // Comparable을 상속받은 객체에서 사용함
  private static void swap(int idx1, int idx2, Weeks8_2.interfaceTest.Comparable[] values) {
    Weeks8_2.interfaceTest.Comparable temp = values[idx1];
    values[idx1] = values[idx2];
    values[idx2] = temp;
  }

}
