package a02.t08;

import java.util.ArrayList;

public class TestReverseArray {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();

    for (int i = 1; i <= 10; i++) {
      arr.add(i);
    }

    assert arr.toString().equals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");
    
    ReverseArray.reverse(arr);
    
    assert arr.toString().equals("[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]");
  }
}
