package a02.t02;

public class TestBall {
  public static void main(String[] args) {
    Ball b0 = new Ball();

    assert b0.getX() == 0;
    assert b0.getY() == 0;

    Ball b = new Ball(34.5, 66.2);

    assert b.getX() == 34.5;
    assert b.getY() == 66.2;

    b.setX(10);
    b.setY(5);
    assert b.getX() == 10;
    assert b.getY() == 5;

    b.setXY(16, 15);
    assert b.getX() == 16;
    assert b.getY() == 15;

    b.move(4, 2.52);
    assert b.getX() == 20;
    assert b.getY() == 17.52;

    b.move(-20, -1.52);
    assert b.getX() == 0;
    assert b.getY() == 16;
  }
}
