import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class practice {
    public static void mainDraw(Graphics graphics){

        graphics.drawLine(0, 0, 200, 50);
        graphics.drawRect(50, 50, 100, 90);
        graphics.fillRect(60, 60, 100, 90);
        graphics.fillOval(120, 10, 180, 90);

        graphics.fillRect(200,200,200,200);
        graphics.setColor(new Color(200,200,0,150));
        graphics.fillRect(210,210,200,200);

        int xpoints[] = {25, 145, 25, 145, 25};
        int ypoints[] = {25, 25, 145, 145, 25};
        int npoints = 5;

        graphics.drawPolygon(xpoints, ypoints, npoints);



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
