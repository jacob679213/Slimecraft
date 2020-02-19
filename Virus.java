/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slimecraft;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author 679213
 */
public class Virus extends Sprite {
    private static final Color COLOR = new Color (255, 0, 255);
    private static int speed = (int)(Math.random() * 10);
    private int lifespan = (int)(Math.random()*10000);
    private int time = 0;
    
    public Virus(int x, int y){
        super(speed, x, y, 5, 5, COLOR);
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(super.getColor());
        g.fillOval(super.getX(), super.getY(), super.getWidth(), super.getHeight());
        time++;
        
       if(time >= lifespan){
            super.die();
        }
    }
}
