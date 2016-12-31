package com.mark.game.model;

import com.mark.game.main.Resources;

import java.awt.Rectangle;

/**
 * Created by gerrity95 on 30/12/16.
 */
public class Player {

    private float x, y;
    private int width, height, velY;
    private Rectangle rect, jumpRect, ground;

    private boolean isAlive;
    private boolean isJumped;
    private float jumpDuration = .6f;

    private static final int JUMP_VELOCITY = -600;
    private static final int ACCEL_Gravity = 1800;

    public Player(float x, float y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        ground = new Rectangle(0, 405, 800, 45); //Represents the bounding rectangle of the ground - will need to change
        rect = new Rectangle();
        jumpRect = new Rectangle();
        isAlive = true;
        isJumped = false;
        updateRects();
    }

    public void update(float delta)
    {

        if (!isGrounded()) {
            velY += ACCEL_Gravity * delta;
        } else {
            y = 406 - height;
            velY = 0;
        }

        y += velY * delta;
        updateRects();
    }

    public void updateRects()
    {
        rect.setBounds((int) x + 10, (int) y, width -20, height);
        jumpRect.setBounds((int) x, (int) y + 20, width, height - 20);
    }

    public void jump()
    {
        if (isGrounded()) {
            //Resources.onjump.play(); //This plays a noise when the user jumps, must be added into resource file
            y -= 10;
            velY = JUMP_VELOCITY;
            updateRects();
        }
    }

    public boolean isGrounded()
    {
        return rect.intersects(ground); //returns true if the user is in contact with ground rectangle
    }

}
