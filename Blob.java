/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slimecraft;

import java.awt.Color;

/**
 *
 * @author 679213
 */
public class Blob extends Slime {
    private static final int SPEED = 5;
    private static final Color COLOR = Color.BLUE;
        
    public Blob(int x, int y) {
        super(SPEED, x, y, COLOR);
    }  
    
    public void fight(Glob glob) {
        if (super.collide(glob)) {
            if (super.getStrength() >= glob.getStrength()) {
                glob.die();
                this.win(glob.getStrength());
            } else {
                this.die();
                glob.win(super.getStrength());
            }
        }
    }
    
    public Blob reproduce(Blob mate) {
        int newX = super.getX() + (int) (Math.random() * 60 - 30);
        int newY = super.getY() + (int) (Math.random() * 60 - 30);
        Blob baby = new Blob(newX, newY);
        return baby;
    }
    
}