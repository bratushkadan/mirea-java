package a02.t06;

public class TestCircle {
  private static final double DELTA = 0.01;
  
  public static void main(String[] args) {
    Circle c = new Circle(1);

    assert TestCircle.valueInNeighbourhood(c.getArea(), 3.14);
    assert TestCircle.valueInNeighbourhood(c.getLength(), 6.28);

    c.setRadius(5);

    assert TestCircle.valueInNeighbourhood(c.getArea(), 78.53);
    assert TestCircle.valueInNeighbourhood(c.getLength(), 31.41);
  }

  private static final boolean valueInNeighbourhood(double val, double target) {
    return Math.abs(val - target) < TestCircle.DELTA;
  }
}
