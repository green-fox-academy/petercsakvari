import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawingOne {
  private static void mainDraw(Graphics graphics) {
    int startingX = WIDTH;
    int startingY = HEIGHT;
    int size = WIDTH/3;
    int counter = 0;
    int newWidht = 0;
    int newHeigth = 0;
    drawThisPlz(graphics, startingX, startingY, size, counter);

  }

  public static void drawThisPlz (Graphics graphics, int startX, int startY, int size, int counter) {
    if (counter == 2) {

    } else {
      //TOP
      graphics.drawRect(startX/3, 0, size, size);
      //BOTTOM
      graphics.drawRect(startX/3, startY - (startY / 3), size, size);
      //RIGHT
      graphics.drawRect(startX - (startX / 3), startY / 3, size, size);
      //LEFT
      graphics.drawRect(0, startY / 3, size, size);

      drawThisPlz(graphics, startX + startX/3, startY + startY/3, size/3, counter + 1);

    }
  }



  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}