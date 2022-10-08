package a03.math_random.t1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GenRandNums {
  public static void main(String[] args) {
    ArrayList<Integer> arr = GenRandNums.genRandMethod(10);
    System.out.println(arr);
    Collections.sort(arr);
    System.out.println(arr);
    
    arr = GenRandNums.genRandClass(10);
    System.out.println(arr);
    Collections.sort(arr);
    System.out.println(arr);
  }

  public static final ArrayList<Integer> genRandMethod(int n) {
    ArrayList<Integer> result = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int num = (int)(Math.floor(Math.random() * (50 - 0 - 1)) + 0);
      result.add(num);
    }

    return result;
  }

  public static final ArrayList<Integer> genRandClass(int n) {
    Random rand = new Random();

    ArrayList<Integer> result = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      result.add(rand.nextInt(50));
    }

    return result;
  }
}