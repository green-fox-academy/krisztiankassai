import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowSquares {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        for (int i = 0; i < 50; i++) {
            int squaresize = i + (int)(Math.random()*i);
            Color color = new Color((int)(Math.random()*50),(int)(Math.random()*50),(int)(Math.random()*50));

            squareDrawer(squaresize, color, graphics);
        }

    }
    public static void squareDrawer(int squaresize, Color color, Graphics graphics){

            graphics.setColor(color);
            graphics.fillRect((WIDTH-squaresize)/2,(HEIGHT-squaresize)/2, squaresize,squaresize);


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
