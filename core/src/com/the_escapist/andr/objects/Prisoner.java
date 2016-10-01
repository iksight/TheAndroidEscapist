package com.the_escapist.andr.objects;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by NKostya on 01.10.2016.
 */
public class Prisoner {

    private Vector2 position;
    private Vector2 velocity;
    private Vector2 acceleration;

    private int width;
    private int height;

    public Prisoner(float x, float y, int width, int height) {
        this.width = width;
        this.height = height;
        position = new Vector2(x, y);
        velocity = new Vector2(0, 0);
        acceleration = new Vector2(0, 460);
    }

    public void update(float delta) {
        velocity.add(acceleration.cpy().scl(delta));
        if (velocity.x > 200) {
            velocity.x = 200;
        }

        position.add(velocity.cpy().scl(delta));
    }

    public void onClick() {
        velocity.x = -140;
    }

    public float getX() {
        return position.x;
    }

    public float getY() {
        return position.y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
