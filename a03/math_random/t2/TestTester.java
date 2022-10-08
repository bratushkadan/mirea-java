package a03.math_random.t2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestTester {
  public static void main(String[] args) {
    Tester t = new Tester();

    Random r = new Random();
    ArrayList<Double> randNumArray = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      double num = r.nextDouble(20);
      randNumArray.add(num);
      t.addCircle(new Circle(num));
    }

    Collections.sort(randNumArray);

    System.out.println(t.toString());

    System.out.println(t.smallestCircle().getRadius());
    System.out.println(t.biggestCircle().getRadius());

    t.arrange();

    System.out.println(t.toString());
    /*
     * 18.598, 6.235, 0.749, 1.139, 5.720, 19.071, 18.353, 1.174, 6.454, 15.373
     * 0.7486277239026795
     * 19.070684628946818
     * 0.749, 1.139, 1.174, 5.720, 6.235, 6.454, 15.373, 18.353, 18.598, 19.071
     */
  }
}
