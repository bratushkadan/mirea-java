package a05;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class T1 {
  public static void main(String args[]) {
    App1 app = new App1();
    app.run();
  }
}

class App1 {
  public JFrame frame = new JFrame("App");
  public JPanel panel = new JPanel();
  public int milanScore = 0;
  public int realScore = 0;
  public String lastScorer = "N/A";
  public JButton milanBtn = new JButton("AC MILAN");
  public JButton realBtn = new JButton("Real Mardid");
  public JLabel l1 = new JLabel("Result 0 x 0");
  public JLabel l2 = new JLabel("Last Scorer: N/A");
  public JLabel l3 = new JLabel("Winner: DRAW");

  public final void run() {
    this.populateFrame();
  }

  public void populateFrame() {
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(900, 600);

    panel.setBackground(Color.GRAY);
    panel.setPreferredSize(new Dimension(900, 600));

    milanBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {
        btnActionPerformed(e);
      }
    });
    realBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent e) {
        btnActionPerformed(e);
      }
    });

    panel.add(milanBtn);
    panel.add(realBtn);
    panel.add(l1);
    panel.add(l2);
    panel.add(l3);
    frame.getContentPane().add(panel);

    frame.pack();
    frame.setLayout(null);
    frame.setVisible(true);
  }

  private void btnActionPerformed(java.awt.event.ActionEvent e) {
    if (e.getActionCommand() == "AC MILAN") {
      this.milanScore++;
      this.l2.setText(String.format("Last Scorer: AC Milan"));
    } else if (e.getActionCommand() == "Real Mardid") {
      this.realScore++;
      this.l2.setText(String.format("Last Scorer: Real Madrid"));
    }
    this.l1.setText(String.format("Result %d x %d", this.milanScore, this.realScore));
    this.l3.setText(String.format("Winner: %s", this.milanScore == this.realScore ? "Draw" : this.milanScore > this.realScore ? "Milan" : "Real"));
  }
}
