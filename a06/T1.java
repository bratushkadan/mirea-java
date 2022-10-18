package a06;

public class T1 {
  public static void main(String[] args) {
    
  }
}

interface Movable {
  void moveUp();
  void moveDown();
  void moveLeft();
  void moveRight();
}

// ~ в UML означает, что класс может быть использован в этом пакете, но не может быть импортирован внешними пакетами (класс не public)
class MovablePoint implements Movable {
  public int x;
  public int y;
  public int xSpeed;
  public int ySpeed;

  public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
    this.x = x;
    this.y = y;
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  public final String toString() {
    return String.format("(%d, %d)", this.x, this.y);
  }

  public void moveUp() {
    this.y += ySpeed;
  }
  public void moveDown() {
    this.y -= ySpeed;
  }
  public void moveLeft() {
    this.x -= xSpeed;
  }
  public void moveRight() {
    this.x += xSpeed;
  }
}
