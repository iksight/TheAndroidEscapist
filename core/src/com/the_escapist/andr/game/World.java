package com.the_escapist.andr.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.the_escapist.andr.objects.Prisoner;

/**
 * Created by NKostya on 01.10.2016.
 */
public class World {

    private Prisoner prisoner;

    public World() {
        prisoner = new Prisoner(0, 33, 17, 12);
    }

    public void update(float delta) {
        prisoner.update(delta);
    }

    public Prisoner getPrisoner() {
        return prisoner;

    }
}
