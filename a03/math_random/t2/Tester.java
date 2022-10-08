package a03.math_random.t2;

import java.util.ArrayList;
import java.util.Collections;

public class Tester {
  private ArrayList<Circle> circles = new ArrayList<>();

  public Tester(Circle... circles) {
    for (int i = 0; i < circles.length; i++) {
      this.circles.add(circles[i]);
    }
  }

  public final Circle smallestCircle() {
    if (this.circles.size() == 0) {
      return null;
    }

    int smallestIdx = 0;
    double smallestRadius = this.circles.get(0).getRadius();
    for (int i = 1; i < circles.size(); i++) {
      double radius = this.circles.get(i).getRadius();
      if (radius < smallestRadius) {
        smallestRadius = radius;
        smallestIdx = i;
      }
    }

    return this.circles.get(smallestIdx);
  }
  public final Circle biggestCircle() {
    if (this.circles.size() == 0) {
      return null;
    }

    int biggestIdx = 0;
    double biggestRadius = this.circles.get(0).getRadius();
    for (int i = 1; i < circles.size(); i++) {
      double radius = this.circles.get(i).getRadius();
      if (radius > biggestRadius) {
        biggestRadius = radius;
        biggestIdx = i;
      }
    }

    return this.circles.get(biggestIdx);
  }

  public final void arrange() {
    Collections.sort(this.circles, new CircleComparator());
  }

  public final void addCircle(Circle circle) {
    this.circles.add(circle);
  }

  public final int getCirclesLen() {
    return this.circles.size();
  }

  public final Circle getNthCircle(int n) {
    return this.circles.get(n);
  }
  
  public final String toString() {
    String res = "";

    for (int i = 0; i < circles.size(); i++) {
      res += String.format("%s%.3f", i == 0 ? "" : ", ", this.circles.get(i).getRadius());
    }

    return res;
  }
}
