/*
 * OT: To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grfxdemo20170123;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class GrfxPanel extends JPanel {
    private List<UIElement> elements = new ArrayList();
    private List<UIElement> points = new ArrayList();
    
    GrfxPanel() {
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent me) {
                System.out.println("MOuse drag detected.");
                
                int x = me.getX();
                int y = me.getY();
                
                points.add(new Circle(x, y, 5, true));
                
            }
        });
        
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent me) {
                if (me.getClickCount() == 2) {
                    points.clear();
                }
            }
        });
        
    }
    
    @Override
    protected void paintComponent(Graphics g) { 
        super.paintComponent(g); 
        
        for (UIElement element: elements) {
            element.drawOn(g);
        }
        for (UIElement point: points) {
            point.drawOn(g);
        }
    }
    
    public void add(UIElement element) {
        elements.add(element);
    }
}
