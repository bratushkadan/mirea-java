package a04_1;

public class T1Forms {
  public static void main(String[] args) {
    Circle_ c = new Circle_(2.3);
    System.out.println(c.getType()); // Circle
    T1Shape s = (T1Shape)c;
    System.out.println(s.getType()); // Circle
  }
}

class Circle_ extends T1Shape {
  private final double radius;

  public Circle_(double rad) {
    this.radius = rad;
  }
  
  @Override   
  public String getType() {
    return "Circle";
  }
  @Override   
  public double getPerimeter() {
    return 2 * Math.PI * this.radius;
  }
  @Override   
  public double getArea() {
    return Math.PI * this.radius * this.radius;
  }
  @Override   
  public String toString() {
    return "";
  }
}

class Rectangle_ extends T1Shape {
  private final double side1;
  private final double side2;

  public Rectangle_(double s1, double s2) {
    side1 = s1;
    side2 = s2;
  }
  
  @Override   
  public String getType() {
    return "Rectangle";
  }
  @Override   
  public double getPerimeter() {
    return 2 * (side1 + side2);
  }
  @Override   
  public double getArea() {
    return side1 * side2;
  }
  @Override   
  public String toString() {
    return "";
  }
}

class Square_ extends T1Shape {
  private final double side;

  public Square_(double side) {
    this.side = side;
  }
  
  @Override   
  public String getType() {
    return "Square";
  }
  @Override   
  public double getPerimeter() {
    return 4 * side;
  }
  @Override   
  public double getArea() {
    return side * side;
  }
  @Override   
  public String toString() {
    return "";
  }
}
