package a05;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.*;

public class T4 extends JPanel {
  private static final int D_HEIGHT = 500;
  private static final int D_WIDTH = 400;
  private static final int INCREMENT = 12;
  private List<Shape> shapes;
  private List<Color> colors;
  private Timer timer = null;

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.add(new T4());
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

  public T4() {
    colors = createColorList();
    shapes = createShapeList();

    timer = new Timer(30, new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        for (Shape shape : shapes) {
          shape.move();
          shape.draw();
          repaint();
        }
      }
    });
    JButton start = new JButton("Start");
    start.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        timer.start();
      }
    });
    JButton reset = new JButton("Reset");
    reset.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        shapes = createShapeList();
        timer.restart();
      }
    });

    JPanel panel = new JPanel();
    panel.add(start);
    panel.add(reset);
    setLayout(new BorderLayout());
    add(panel, BorderLayout.PAGE_START);
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (Shape shape : shapes) {
      shape.drawShape(g);
    }
  }

  @Override
  public Dimension getPreferredSize() {
    return new Dimension(D_WIDTH, D_HEIGHT);
  }

  private List<Color> createColorList() {
    List<Color> list = new ArrayList<>();
    list.add(Color.BLUE);
    list.add(Color.GREEN);
    list.add(Color.ORANGE);
    list.add(Color.MAGENTA);
    list.add(Color.CYAN);
    list.add(Color.PINK);
    return list;
  }

  private List<Shape> createShapeList() {
    List<Shape> list = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < 5; i++) {
      int randomDelayedStart = 0;
      int colorIndex = random.nextInt(colors.size());
      Color color = colors.get(colorIndex);
      list.add(new Shape(random.nextInt(D_WIDTH), color));
    }

    return list;
  }

  class Shape {

    int x;
    int y = D_HEIGHT;
    boolean draw = false;
    boolean down = false;
    Color color;

    public Shape(int x, Color color) {
      this.x = x;
      this.color = color;
    }

    public void drawShape(Graphics g) {
      if (draw) {
        g.setColor(color);
        g.fillOval(x, y, 30, 30);
      }
    }

    public void move() {
      if (draw) {
        System.out.println(y);
        if (y <= 50) {
          down = true;
        }

        if (down && y >= 480) {
          down = false;
        }

        if (down) {
          y += INCREMENT;
        } else {
          y -= INCREMENT;
        }
      }
    }

    public void draw() {
      draw = true;
    }

  }
}