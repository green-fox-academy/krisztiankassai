import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
    public static void mainDraw(Graphics graphics) {
        // Draw the canvas' diagonals.
        // If it starts from the upper-left corner it should be green, otherwise it should be red.
        int upleftx = 0;
        int uplefty = 0;

        if (upleftx + uplefty <= 0) {
            graphics.setColor(Color.GREEN);
            graphics.drawLine(upleftx, uplefty, 320, 320);

        } else if (upleftx + uplefty != 0) {
            graphics.setColor(Color.red);
            graphics.drawLine(upleftx, uplefty, 320, 320);
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("HorizontalLines");
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