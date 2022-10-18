package a07;

public class T4 {
  public static void main(String[] args) {
    MathCalculable mc1 = new MathFunc();
    // MathCalculable mc2 = new MathCalculable();
  }
}

interface MathCalculable {
  double PI = Math.PI;

  int square(int num);

  double square(double num);

  double circleLen(double radius);
}

class MathFunc implements MathCalculable {
  public int square(int num) {
    return num * num;
  }

  public double square(double num) {
    return num * num;
  }

  public double circleLen(double radius) {
    return 2 * PI * radius;
  }
}
