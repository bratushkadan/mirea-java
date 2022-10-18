package a08;

public class T3 {
  public static void main(String[] args) {
    nums(11, 5);
    System.out.println();
    nums(16, 22);
  }

  public static void nums(int a, int b) {
    if (a >= b)  {
      numsDesc(a, b);
    } else {
      numsAsc(a, b);
    }
  }

  public static void numsAsc(int from, int to) {
    if (from > to) {
      return;
    }
    System.out.println(from);
    numsAsc(from + 1, to);
  }

  public static void numsDesc(int from, int to) {
    if (from < to) {
      return;
    }
    System.out.println(from);
    numsDesc(from - 1, to);
  }
}
