package a05;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class T3 {
  public static void main(String[] args) {
    JFrame frame = new JFrame("SetBounds Method Test");
    frame.setSize(1920, 1080);
    frame.setLayout(null);

    try {
      ImagePanel panel = new ImagePanel(args[0]);
      panel.setBounds(0, 0, 1920, 1080);

      frame.add(panel);
    } catch (IOException err) {
      System.err.println(err);
      System.exit(1);
    }

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}

class ImagePanel extends JPanel {
    private BufferedImage image;

    public ImagePanel(String path) throws IOException {
       image = ImageIO.read(new File(path));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters            
    }

}
