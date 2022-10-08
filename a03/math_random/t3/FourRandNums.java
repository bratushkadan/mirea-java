package a03.math_random.t3;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class FourRandNums {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    boolean strictAscending = true;
    int previous = 9;
    for (int i = 0; i < 4; i++) {
      // [10; 99]
      int num = ThreadLocalRandom.current().nextInt(89) + 10;
      arr.add(num);
      if (strictAscending && previous >= num) {
        strictAscending = false;
      } else {
        previous = num;
      }
    }

    System.out.format("Последовательность %s — %s%s\n", arr.toString(), !strictAscending ? "Не " : "",
        "строго вострастающая.");
    /*
     * Последовательность [98, 60, 49, 46] — Не строго вострастающая.
     * Последовательность [15, 41, 73, 78] — строго вострастающая.
     */
  }
}
