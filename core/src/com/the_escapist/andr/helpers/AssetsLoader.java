package com.the_escapist.andr.helpers;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by NKostya on 01.10.2016.
 */
public class AssetsLoader {

    public static Texture texture;
    public static TextureRegion textureRegion;

    public static Animation animation;

    public static void load() {

    }

    public static void dispose() {
        texture.dispose();
    }
}
