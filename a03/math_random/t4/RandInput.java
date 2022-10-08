package a03.math_random.t4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;;

public class RandInput {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Введите целое число - размер массива: ");
    int n = 0;
    while (scan.hasNextLine()) {
      if (scan.hasNextInt()) {
        n = scan.nextInt();
        break;
      } else {
        System.out.print("Введите целое число - размер массива: ");
        scan.nextLine();
      }
    }
    scan.close();

    ArrayList<Integer> arr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      arr.add(ThreadLocalRandom.current().nextInt(100));
    }

    ArrayList<Integer> filteredArr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int el = arr.get(i);
      if (el % 2 == 0) {
        filteredArr.add(el);
      }
    }

    System.out.println(arr);
    if (filteredArr.size() > 0) {
      System.out.println(filteredArr);
    }
    /*
     * [26, 49]
     * [26]
     * 
     * [80, 66]
     * [80, 66]
     * 
     * [19, 13]
     */
  }
}
