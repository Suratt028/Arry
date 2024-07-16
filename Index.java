public class Main {
  public static int findZeroIndex(int[] a1, int[] a2) {
    int low = 0;
    int high = a2.length - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (a2[mid] == 0) {
        if (mid == 0 || a2[mid - 1] != 0) {
          return mid;
        } else {
          high = mid - 1;
        }
      } else if (a2[mid] < 0) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    return -1; // ไม่พบ 0
  }

  public static void main(String[] args) {
    int[] a1 = {1, 3, 4, 6, 7, 8, 9, 20};
    int[] a2 = {1, 3, 0, 4, 6, 7, 8, 9, 20};

    int index = findZeroIndex(a1, a2);

    if (index != -1) {
      System.out.println("ดัชนีของ 0 ใน a2: " + index);
    } else {
      System.out.println("ไม่พบ 0 ใน a2");
    }
  }
}
