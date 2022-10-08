package a02.t03;

public class Point {
  private double x = 0;
  private double y = 0;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Point() {
  }

  public final double getX() {
    return this.x;
  }

  public final void setX(double x) {
    this.x = x;
  }

  public final double getY() {
    return this.y;
  }

  public final void setY(double y) {
    this.y = y;
  }
}
