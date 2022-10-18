package a05;

import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.Graphics;
import javax.swing.*;

public class T2 {
  public static void main(String arg[]) {
    JFrame frame = new JFrame("SetBounds Method Test");
    frame.setSize(1920, 1080);
    frame.setLayout(null);

    for (int i = 0; i < 20; i++) {
      int[] dim = randDimension();
      DisplayGraphics m = new DisplayGraphics(randFigure(), randColor(), dim[0], dim[1], dim[2], dim[3]);
      m.setBounds(dim[0], dim[1], dim[0] + dim[2], dim[1] + dim[3]);
      frame.add(m);
    }

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

  private static Color randColor() {
    return new Color(ThreadLocalRandom.current().nextInt(256), ThreadLocalRandom.current().nextInt(256), ThreadLocalRandom.current().nextInt(256));
  }

  private static int randFigure() {
    return ThreadLocalRandom.current().nextInt(3);
  }

  private static int[] randDimension() {
    int[] arr = {ThreadLocalRandom.current().nextInt(512), ThreadLocalRandom.current().nextInt(512), ThreadLocalRandom.current().nextInt(64) + 64, ThreadLocalRandom.current().nextInt(64) + 64};
    return arr;
  }
}

class DisplayGraphics extends JPanel {
  private int figure;
  private Color col;
  private int x;
  private int y;
  private int width;
  private int height;

  public DisplayGraphics(int figure, Color col, int x, int y, int width, int height) {
    this.figure = figure;
    this.col = col;
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public void paint(Graphics g) {
    if (this.figure == 0) {
      g.fillOval(x, y, width, height);
    } else if (this.figure == 1) {
      g.fillRect(x, y, width, height);
    } else if (this.figure == 2) {
      g.fillRect(x, x, width, height);
    }
    setForeground(col);
  }
}

class SetBoundsTest {
}
