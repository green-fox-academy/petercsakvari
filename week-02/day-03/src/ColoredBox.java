import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.

        //graphics.setColor(new Color(255, 0, 0));
        //graphics.drawRect(20, 100, 40, 40);


        graphics.setColor(new Color(255, 0, 0));
        graphics.drawLine(20, 20, 60, 20);

        graphics.setColor(new Color(0, 255, 0));
        graphics.drawLine(20, 20, 20, 60);

        graphics.setColor(new Color(0, 0, 255));
        graphics.drawLine(60, 20, 60, 60);

        graphics.setColor(new Color(254, 255, 0));
        graphics.drawLine(20, 60, 60, 60);


    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

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
