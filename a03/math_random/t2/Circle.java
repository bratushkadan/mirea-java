package a03.math_random.t2;

import java.util.Comparator;

public class Circle {
  private double radius;
  private Point p;
  
  public Circle(double radius, double x, double y) {
    this.radius = radius;
    this.p = new Point(x, y);
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public final double getRadius() {
    return this.radius;
  }

  public final double getLen() {
    return 2 * Math.PI * this.radius;
  }

  public final double getArea() {
    return Math.PI * this.radius * this.radius;
  }

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

class CircleComparator implements Comparator<Circle> {
  public int compare(Circle a, Circle b) {
    double res = a.getRadius() - b.getRadius();
    
    if (res > 0) {
      return 1;
    }
    
    if (res < 0) {
      return -1;
    }
    
    return 0;
  }
}

