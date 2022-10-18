package a04_1;

public class T8 {

}

abstract class Shape {
  protected String color;
  protected boolean filled;

  public Shape() {
  };

  public Shape(String color, boolean filled) {
    this.color = color;
    this.filled = filled;
  };

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return this.filled;
  };

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  abstract public double getArea();

  abstract public double getPerimeter();

  abstract public String toString();
}

class Circle extends Shape {
  protected double radius;

  public Circle() {
    this.radius = 1;
  }

  public Circle(double rad) {
    this.radius = rad;
  }

  public Circle(double rad, String color, boolean filled) {
    this.radius = rad;
    this.color = color;
    this.filled = filled;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getPerimeter() {
    return 2 * Math.PI * this.radius;
  }

  public double getArea() {
    return Math.PI * this.radius * this.radius;
  }

  public String toString() {
    return String.format("Circle (%s) %s: radius = %f", color, filled ? "filled" : "not filled", radius);
  }
}

class Rectangle extends Shape {
  protected double width;
  protected double length;

  public Rectangle() {
    this.width = 1;
    this.length = 2;
  }

  public Rectangle(double w, double l) {
    width = w;
    length = l;
  }
  public Rectangle(double w, double l, String col, boolean filled) {
    width = w;
    length = l;
    color = col;
    this.filled = filled;
  }

  public double getWidth() {
    return this.width;
  }
  public void setWidth(double width) {
    this.width = width;
  }
  public double getLength() {
    return this.length;
  }
  public void setLength(double length) {
    this.length = length;
  }

  public double getPerimeter() {
    return 2 * (width + length);
  }

  public double getArea() {
    return width * length;
  }

  public String toString() {
    return String.format("Rectangle (%s) %s: %fx%f", color, filled ? "filled" : "not filled", width, length);
  }
}

class Square extends Rectangle {
  public Square() {
    super();
  }
  public Square(double side) {
    this.width = side;
    this.length = side;
  }
  public Square(double side, String color, boolean filled) {
    this.width = side;
    this.length = side;
  }

  public double getSide() {
    return this.width;
  }
  public void setSide(double side) {
    this.width = side;
    this.length = side;
  }

  @Override
  public void setWidth(double width) {
    this.width = width;
    this.length = width;
  }
  @Override
  public void setLength(double length) {
    this.width = length;
    this.length = length;
  }

  public String toString() {
    return String.format("Rectangle (%s) %s: with side %f", color, filled ? "filled" : "not filled", width);
  }
}
