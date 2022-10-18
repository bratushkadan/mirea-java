package a06;

public class T2 {
  public static void main(String[] args) {
      MovableRectangle r = new MovableRectangle(5, 6, 8, 11, 3, 4);
   
      assert(r.xDiff() == 3);
      assert(r.yDiff() == 5);
      
      r.moveDown();
      r.moveDown();
      r.moveDown();
      r.moveDown();
      r.moveDown();
      r.moveDown();
      r.moveRight();
      r.moveRight();
      r.moveUp();
      
      assert(r.xDiff() == 3);
      assert(r.yDiff() == 5);
  }
}

class MovableRectangle implements Movable {
  private MovablePoint topLeft; 
  private MovablePoint bottomRight;

  public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
    int speed = Math.min(xSpeed, ySpeed); // чтобы точки двигались с одинаковой скоростью;

    this.topLeft = new MovablePoint(Math.min(x1, x2), Math.max(y1, y2), speed, speed);
    this.bottomRight = new MovablePoint(Math.max(x1, x2), Math.min(y1, y2), speed, speed);
  }

  public int xDiff() {
    return bottomRight.x - topLeft.x;
  }

  public int yDiff() {
    return topLeft.y - bottomRight.y;
  }

  public void moveUp() {
    this.topLeft.moveUp();
    this.bottomRight.moveUp();
  }
  public void moveDown() {
    this.topLeft.moveDown();
    this.bottomRight.moveDown();
  }
  public void moveLeft() {
    this.topLeft.moveLeft();
    this.bottomRight.moveLeft();
  }
  public void moveRight() {
    this.topLeft.moveRight();
    this.bottomRight.moveRight();
  }
}
