package com.mark.game.main;

/**
 * Created by gerrity95 on 12/12/16.
 */
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

import com.mark.framework.animation.Animation;
import com.mark.framework.animation.Frame;

public class Resources {

    public static BufferedImage welcome, iconimage, selector, player_duck, player_jump, player_stand, player_hurt, player_walk2, player_walk7, player_walk6, player_walk5, player_walk4, grass, colored_grass_background;

    public static Animation runAnim, jumpAnim, duckAnim;

    public static void load() {

        welcome = loadImage("other/welcome.png");
        iconimage = loadImage("other/iconimage.png");
        selector = loadImage("other/selector.png");

        //User Images
        player_duck = loadImage("user/player/p2_duck.png");
        player_jump = loadImage("user/player/p2_jump.png");
        player_stand = loadImage("user/player/p2_stand.png");
        player_hurt = loadImage("user/player/p2_hurt.png");


        player_walk2 = loadImage("user/player/player_walk/p2_walk02.png");
        player_walk7 = loadImage("user/player/player_walk/p2_walk07.png");
        player_walk6 = loadImage("user/player/player_walk/p2_walk06.png");
        player_walk5 = loadImage("user/player/player_walk/p2_walk05.png");
        player_walk4 = loadImage("user/player/player_walk/p2_walk04.png");


        grass = loadImage("ground/Grass/grass.png");
        colored_grass_background = loadImage("background_1024x640/colored_grass.png");

        //Run Frames
        Frame w1 = new Frame(player_walk2, .1f);
        Frame w2 = new Frame(player_walk7, .1f);
        Frame w3 = new Frame(player_walk6, .1f);
        Frame w4 = new Frame(player_walk5, .1f);
        Frame w5 = new Frame(player_walk4, .1f);


        //Jump Frames:
        Frame j1 = new Frame(player_walk2, .1f);
        Frame j2 = new Frame(player_jump, .1f);

        //Duck Frames
        Frame d1 = new Frame(player_walk4, .1f);
        Frame d2 = new Frame(player_duck, .1f);


        //Run animation:
        runAnim = new Animation(w1, w2, w3, w4, w5, w4, w3, w2);

        //Jump Animation:
        jumpAnim = new Animation(j1, j2);

        //Duck Animation:
        duckAnim = new Animation(d1, d2);
    }

    private static AudioClip loadSound(String filename) {
        URL fileURL = Resources.class.getResource("/resources/" + filename);
        return Applet.newAudioClip(fileURL);
    }

    private static BufferedImage loadImage(String filename) {
        BufferedImage img = null;
        try {
            img = ImageIO.read(Resources.class.getResourceAsStream("/resources/" + filename));
        } catch (IOException e) {
            System.out.println("Error while reading: " + filename);
            e.printStackTrace();
        }
        return img;
    }

}