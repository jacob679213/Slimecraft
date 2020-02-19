/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slimecraft;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
/**
 *
 * @author 679213
 */
public class Slime extends Sprite {
    //static constants
    private static final int WIDTH = 10;
    private static final int HEIGHT = 15;
    private int strength;
    private int infectedTimer = 0;
    private boolean infected = false;
    
    public Slime(int speed, int x, int y, Color color) {
        super(speed, x, y, WIDTH, HEIGHT, color);
        this.strength = (int) (Math.random() * 20);
    }
    
     public void eat(Food food) {
        if (super.getBounds().intersects(food.getBounds()) && food.isAlive()) {
            super.setHeight(super.getHeight() + 5);
            super.setWidth(super.getWidth() + 5);
            food.die();
        }
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(super.getColor());
        g.drawRect(super.getX(), super.getY(), super.getWidth(), super.getHeight());
        if(this.infected){
            infectedTimer ++;
        }
    }

    public int getStrength() {
        return strength;
    }
    
    public void win(int otherStrength){
        if(otherStrength > this.strength){
            this.strength += (otherStrength - this.strength);
        }
        else{
            this.strength += (this.strength - otherStrength);
        }
    }
    
//    public void infected(ArrayList<Virus> viruses){
//        this.infected = true;
//        
//        while(this.infected){
//            if(infectedTimer % ((int)(Math.random()*1000)+1) == 0 && infectedTimer < 5000){
//
//                int num = (int) (Math.random() * 5 + 1);
//
//                for(int i = 0; i < num; i++){
//                    int tempX = super.getX() * (int)(Math.random() * 20);
//                    int tempY = super.getY() * (int)(Math.random() * 20);
//                    Virus virus = new Virus(tempX, tempY);
//                    viruses.add(virus);
//                }
//            }
//
//            else if(infectedTimer >= 5000){
//                this.die();
//            }
//        }
//    }
}