package Weeks5_2.polymorphism;

public class Util {
  public static void selectionSort(int[] values) {

    // 삽입정렬 만들기
    for (int i = 0; i < values.length; i++) {
      int minIdx = i; // 가장 작은 인덱스 번호
      for (int j = i + 1; j < values.length; j++) {
        // 현재까지 찾은 최소값(values[minIdx])과
        // values[j]를 비교해서 values[j]가 더 작으면
        // minIdx를 j로 설정 : minIdx = j;
        if (values[minIdx] > values[j]) {
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

}
