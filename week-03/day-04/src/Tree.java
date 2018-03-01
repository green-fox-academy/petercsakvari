import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {

  static int iterator = 0;
  static int WIDTH = 700;
  static int HEIGHT = 650;

  private static void mainDraw(Graphics graphics) throws InterruptedException {
    int x0 = WIDTH/2;
    int y0 = HEIGHT-150;
    double branchLength = 5 + iterator * 6;
    double angle = 0;
    drawTree(graphics, x0, y0, branchLength, angle, colorRandomizer());
  }

  private static void drawTree(Graphics graphics, int x0, int y0, double length, double angle, Color randomColor) throws InterruptedException {
    if (length <= 1) {
      return;
    } else {
      int x1 = ((int) (x0 + length * Math.sin(Math.toRadians(angle))));
      int y1 = ((int) (y0 - length * Math.cos(Math.toRadians(angle))));

      graphics.setColor(randomColor);
      graphics.drawLine(x0, y0, x1, y1);

      drawTree(graphics, x1, y1, length - 6, angle + 18, colorRandomizer());
      drawTree(graphics, x1, y1, length - 6, angle - 18, colorRandomizer());

    }
  }

  private static Color colorRandomizer() {
    Random random = new Random();
    int colorRange = 256;
    int r = random.nextInt(colorRange);
    int g = random.nextInt(colorRange);
    int b = random.nextInt(colorRange);
    Color randomColor = new Color(r, g, b);
    return randomColor;
  }

  public static void main(String[] args) throws InterruptedException {
    JFrame jFrame = new JFrame("Tree");
    ImagePanel imagePanel = new ImagePanel();
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(imagePanel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    imagePanel.setBackground(Color.black);
    boolean grow = true;
    while (true) {
      if (iterator == 10) {
        grow = false;
      } else if (iterator == 0) {
        grow = true;
      }
      if (grow){
        iterator++;
      } else {
        iterator--;
      }
      Thread.sleep(250);
      imagePanel.repaint();
    }
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      Graphics2D g2 = (Graphics2D) graphics;
      g2.setStroke(new BasicStroke(2));
      try {
        mainDraw(graphics);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}