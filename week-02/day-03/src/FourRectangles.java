import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        int counter = 0;
        while (counter < 4){
            drawRectangle(graphics);
            counter++;
        }

    }

    private static void drawRectangle(Graphics graphics) {
        Random random = new Random();

        int rectangleXSize = random.nextInt(HEIGHT-10);
        int rectangleYSize = random.nextInt(WIDTH-10);
        int startingXCoordinate = random.nextInt(HEIGHT-rectangleXSize);
        int startingYCoordinate = random.nextInt(WIDTH-rectangleYSize);

        graphics.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        graphics.drawRect(startingXCoordinate, startingYCoordinate, rectangleXSize, rectangleYSize);
    }

    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }
}
