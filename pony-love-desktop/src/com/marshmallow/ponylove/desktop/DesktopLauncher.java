package com.marshmallow.ponylove.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.marshmallow.ponylove.GameMain;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = GameMain.APP_WIDTH;
		config.height = GameMain.APP_HEIGHT;
		config.resizable = GameMain.APP_RESIZABLE;
		config.title = GameMain.APP_TITLE + " - " + GameMain.APP_VERSION;
		
		new LwjglApplication(new GameMain(), config);
	}
}
