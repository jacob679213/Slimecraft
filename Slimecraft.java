/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slimecraft;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

/**
 *
 * @author 679213
 */
public class Slimecraft extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //frame
        JFrame j = new JFrame("Blobby Game");
        World c = new World();
        j.add(c);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(825, 635);
        j.setVisible(true);
        j.setLocationRelativeTo(null);
//        j.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e) {
//                c.keyPressed(e);
//            }
//            @Override
//            public void keyReleased(KeyEvent e) {
//                c.keyReleased(e);
//            }
//        });
    }
    
}
