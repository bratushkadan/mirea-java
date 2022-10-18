package a06;

public class T1MovableCircle implements Movable {
  private int radius;
  private MovablePoint p;

  public void moveUp() {
    this.p.moveUp();
  }
  public void moveDown() {
    this.p.moveDown();
  }
  public void moveLeft() {
    this.p.moveLeft();
  }
  public void moveRight() {
    this.p.moveRight();
  }

  public T1MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
    this.p = new MovablePoint(x, y, xSpeed, ySpeed);
    this.radius = radius;
  }

  public String toString() {
    return String.format("Circle of radius %d with center (%d, %d)", radius, p.x, p.y);
  }
}