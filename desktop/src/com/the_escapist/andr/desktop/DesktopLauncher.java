package com.the_escapist.andr.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.the_escapist.andr.EscapistGame;
import com.the_escapist.andr.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "TheAndroidEscapist";
        config.width = 272;
        config.height = 408;
		new LwjglApplication(new EscapistGame(), config);
	}
}
