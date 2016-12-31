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

    public static BufferedImage welcome, iconimage, selector, bunny1_hurt, bunny1_jump, bunny1_ready, bunny1_walk1, bunny1_walk2, grass, colored_grass_background;

    public static Animation runAnim;

    public static void load() {

        welcome = loadImage("other/welcome.png");
        iconimage = loadImage("other/iconimage.png");
        selector = loadImage("other/selector.png");
        bunny1_hurt = loadImage("user/bunny1_hurt.png");
        bunny1_jump = loadImage("user/bunny1_jump.png");
        bunny1_ready = loadImage("user/bunny1_ready.png");
        bunny1_walk1 = loadImage("user/bunny1_walk1.png");
        bunny1_walk2 = loadImage("user/bunny1_walk2.png");
        grass = loadImage("ground/Grass/grass.png");
        colored_grass_background = loadImage("background_1024x640/colored_grass.png");

        Frame f1 = new Frame(bunny1_walk1, .1f);
        Frame f2 = new Frame(bunny1_walk2, .1f);



        runAnim = new Animation(f1, f2, f1, f2);

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