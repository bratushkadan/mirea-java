package a02.t02;

public class Ball {
  private double x;
  private double y;

  public Ball(Double x, Double y) {
    this.x = x;
    this.y = y;
  }

  public Ball() {
    this.x = 0;
    this.y = 0;
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

  public final void setXY(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public final void move(double xDisp, double yDisp) {
    System.out.println("moving the ball!");
    this.setXY(this.x + xDisp, this.y + yDisp);
  }

  public final String toString() {
    return String.format("Ball: (x: %.3f, y: %.3f)", this.x, this.y);
  }
}
