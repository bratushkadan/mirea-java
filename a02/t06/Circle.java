package a02.t06;

public class Circle {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public final double getRadius() {
    return this.radius;
  }

  public final void setRadius(double radius) {
    this.radius = radius;
  }

  public final double getArea() {
    return Math.PI * Math.pow(radius, 2);
  }

  public final double getLength() {
    return 2 * Math.PI * this.radius;
  }
}
