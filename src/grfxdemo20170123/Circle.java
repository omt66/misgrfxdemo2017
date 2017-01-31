/*
 * OT: To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grfxdemo20170123;

import java.awt.Graphics;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Circle extends UIElement {

    int x, y, radius;
    boolean filled;

    public Circle(int x, int y, int radius) {
        this(x, y, radius, false);
    }
    
    public Circle(int x, int y, int radius, boolean filled) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.filled = filled;
    }

    @Override
    public void drawOn(Graphics g) {
        //g.drawOval(x, y, radius);
        int w = radius;
        int h = radius;

        if (filled) {
            g.fillOval(x, y, w, h);
        } else {
            g.drawOval(x, y, w, h);
        }
    }

}
