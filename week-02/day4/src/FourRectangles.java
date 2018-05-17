import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        for (int i = 0; i <4 ; i++) {
            int x = (int) (Math.random() *120);
            int y = (int) (Math.random() *120);
            int width = (int) (Math.random() *150);
            int height = (int) (Math.random() *150);
            rectangeldraw(x,y,width,height, graphics);

        }
        }
    public static void rectangeldraw (int x,int y, int width, int height, Graphics graphics){
        graphics.setColor(new Color ((int) (Math.random() *255),(int) (Math.random() *255),(int) (Math.random() *255)));
        graphics.fillRect(x,y,width,height);
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
    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }
    }

