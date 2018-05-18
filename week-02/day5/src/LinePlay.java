import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics) {
        int lineNumber = 20;
        lineDraw(lineNumber, graphics);
    }

    public static void lineDraw (int lineNumber, Graphics graphics){
        for (int i = 0; i < WIDTH / lineNumber ; i++) {
            graphics.setColor(Color.green);
            graphics.drawLine(i * lineNumber, 0, WIDTH, i*lineNumber );
            graphics.setColor(Color.red);
            graphics.drawLine(0, i * lineNumber, i*lineNumber,HEIGHT  );
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
