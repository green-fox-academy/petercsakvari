import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    static int goDown = 17;
    static int goSideways = 10;
    static int nPoints = 3;

    private static void mainDraw(Graphics graphics) {
        int xCoord = WIDTH / 2;
        int yCoord = HEIGHT / 6;

        drawFull(graphics, xCoord, yCoord);
    }

    private static void drawFull(Graphics graphics, int x, int y) {
        int xFirstPoints[] = {x, x - goSideways, x + goSideways};
        int yFirstPoints[] = {y, y + goDown, y + goDown};
        graphics.drawPolygon(xFirstPoints, yFirstPoints, nPoints);
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int xPoints[] = {x - (i * goSideways), x - (i * goSideways), x + (i * goSideways)};
                int yPoints[] = {y + (i * goDown), y + (i * goDown), y + (i * goDown)};
                graphics.drawPolygon(xPoints, yPoints, nPoints);
            }
        }
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