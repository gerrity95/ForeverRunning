package com.mark.game.main;

/**
 * Created by gerrity95 on 12/12/16.
 */
import javax.swing.JFrame;

public class GameMain {
    private static final String GAME_TITLE = "Forever Running";
    public static final int GAME_WIDTH = 1024;
    public static final int GAME_HEIGHT = 640;
    public static Game sGame;

    public static void main(String[] args) {
        JFrame frame = new JFrame(GAME_TITLE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false); // Prevents manual resizing of window
        sGame = new Game(GAME_WIDTH, GAME_HEIGHT);
        frame.add(sGame);
        frame.pack();
        frame.setVisible(true);
        frame.setIconImage(Resources.iconimage); // This is the new line!
    }

}