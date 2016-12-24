package com.mark.game.state;

/**
 * Created by gerrity95 on 12/12/16.
 */
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import com.mark.game.main.Resources;

public class MenuState extends State {

    @Override
    public void init() {
        System.out.println("Entered MenuState");
    }

    @Override
    public void update(float delta) {
        // Do Nothing
    }

    @Override
    public void render(Graphics g) {
        // Draws Resoruces.welcome to the screen at x = 0, y = 0
        g.drawImage(Resources.welcome, 0, 0, null);
    }

    @Override
    public void onClick(MouseEvent e) {
        System.out.println("On Click!");
    }

    @Override
    public void onKeyPress(KeyEvent e) {
        System.out.println("On KeyPress!");
    }

    @Override
    public void onKeyRelease(KeyEvent e) {
        System.out.println("On KeyRelease!");
    }

}
