package a02.t08;

import java.util.ArrayList;

public class ReverseArray {
  public static final <T> void reverse(ArrayList<T> arr) {
    int midst = arr.size() / 2;
    for (int i = 0; i < midst; i++) {
      int reverseIdx = arr.size() - i - 1;
      T temp = arr.get(i);
      arr.set(i, arr.get(reverseIdx));
      arr.set(reverseIdx, temp);
    }
  }
}
