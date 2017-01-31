/*
 * OT: To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grfxdemo20170123;

import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class GrfxDemo20170123 {
    static int incX = 2;
    static int incY = 2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame frame = new JFrame("Grfx Demo");
       GrfxPanel panel = new GrfxPanel();
       
       Rectangle r1 = new Rectangle(50, 50, 200, 100);
       Rectangle r2 = new Rectangle(150, 150, 100, 100);
       Rectangle r3 = new Rectangle(125, 200, 50, 100);
       Line line1 = new Line(50, 75, 200, 200);
       Circle circle1 = new Circle(150, 150, 50);
       Circle circle2 = new Circle(250, 100, 150);
       
       panel.add(r1);
       panel.add(r2);
       panel.add(r3);
       panel.add(line1);
       panel.add(circle1);
       panel.add(circle2);
       
       int w = 700;
       int h = 500;
       
       frame.add(panel);
       frame.setSize(w, h);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       frame.setVisible(true);
       
       Timer timer = new Timer();
       
       timer.scheduleAtFixedRate(new TimerTask() {
           @Override
           public void run() {
               circle1.x += incX;
               circle1.y += incY;
               
               if (circle1.x > w || circle1.x < 0) {
                   incX *= -1;
               }
               if (circle1.y > h || circle1.y < 0) {
                   incY *= -1;
               }
               panel.updateUI();
               panel.repaint();
           }
           
       }, 1000, 33);
    }
}
