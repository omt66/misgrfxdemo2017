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
public class Rectangle extends UIElement {
    int x, y, width, height;
    
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;      
    }
    
    @Override
    public void drawOn(Graphics g) {
        // Draw rectangle here
        g.drawRect(x, y, width, height);
        
    }
    
}
