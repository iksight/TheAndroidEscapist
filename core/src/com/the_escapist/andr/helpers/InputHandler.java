package com.the_escapist.andr.helpers;

import com.badlogic.gdx.InputProcessor;
import com.the_escapist.andr.objects.Prisoner;

/**
 * Created by NKostya on 01.10.2016.
 */
public class InputHandler implements InputProcessor {

    private Prisoner prisoner;

    public InputHandler(Prisoner prisoner) {
        this.prisoner = prisoner;
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
