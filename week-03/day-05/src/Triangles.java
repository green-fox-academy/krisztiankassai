import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {

        pyramiddrawer(graphics, 5,5,300);

    }
    public static void pyramiddrawer(Graphics graphics, int x, int y, int size){
        int[] xx = {x, x + size, x + size / 2};
        int[] yy = {y, y, (int)(Math.sqrt(3) / 2 * size)};
        int n = 3;
        graphics.drawPolygon(xx,yy,n);
    }
    

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

