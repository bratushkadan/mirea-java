package a02.t03;

public class Tester {
  private Circle[] circles;

  private int size;

  public Tester(int size) {
    this.circles = new Circle[size];
    this.size = size;
  }

  public final Circle getNthCircle(int n) {
    return this.circles[n];
  }

  public final int getSize() {
    return this.size;
  }
}
