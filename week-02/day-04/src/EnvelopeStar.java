import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics){
//        int x1 = 0;
//        int y1 = HEIGHT/2;
//        int ctrlx = WIDTH/2;
//        int ctrly = HEIGHT/2;
//        int x2 = WIDTH/2;
//        int y2 = 0;
//
//        for (int i = 0; i < 3; i++) {
//            QuadCurve2D.Float curve = new QuadCurve2D.Float(x1, y1, ctrlx, ctrly, x2, y2);
//            ((Graphics2D)graphics).draw(curve);
//        }

        graphics.setColor(Color.green);
        for (int i = 1; i < 21; i++) {
            graphics.drawLine(i * 10, HEIGHT/2, WIDTH/2, HEIGHT/2 - (i * 10));
            graphics.drawLine(WIDTH - (i * 10), HEIGHT/2, WIDTH/2, HEIGHT/2 - (i * 10));
            graphics.drawLine(i * 10, HEIGHT/2, WIDTH/2, HEIGHT/2 + (i * 10));
            graphics.drawLine(WIDTH - (i * 10), HEIGHT/2, WIDTH/2, HEIGHT/2 + (i * 10));
        }




    }

    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 390;

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