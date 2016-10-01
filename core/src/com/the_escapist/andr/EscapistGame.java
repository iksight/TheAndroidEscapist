package com.the_escapist.andr;

import com.badlogic.gdx.*;
import com.the_escapist.andr.screens.GameScreen;

/**
 * Created by NKostya on 01.10.2016.
 */
public class EscapistGame extends com.badlogic.gdx.Game {

    @Override
    public void create() {
        Gdx.app.log("Escapist", "created");
        setScreen(new GameScreen());
    }
}
