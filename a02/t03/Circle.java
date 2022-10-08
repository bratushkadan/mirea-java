package a02.t03;

public class Circle {
  private Point p;

  public final double getCenterX() {
    return this.p.getX();
  }

  public final double getCenterY() {
    return this.p.getY();
  }

  public final void setCenterX(double x) {
    this.p.setX(x);
  }

  public final void setCenterY(double y) {
    this.p.setY(y);
  }

  public final void setCenter(double x, double y) {
    this.p.setX(x);
    this.p.setY(y);
  }

  public final String toString() {
    return String.format("(%.3f, %.3f)", this.p.getX(), this.p.getY());
  }
}
